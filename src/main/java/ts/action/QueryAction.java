package ts.action;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.ibatis.session.SqlSession;

import ts.mapper.CityMapper;
import ts.mapper.CountryMapper;
import ts.mapper.CountrylanguageMapper;
import ts.persistence.City;
import ts.persistence.CityExample;
import ts.persistence.Country;
import ts.persistence.CountryExample;
import ts.persistence.Countrylanguage;
import ts.persistence.CountrylanguageExample;
import ts.util.MyBatisSqlSessionFactory;

public class QueryAction {
	private SqlSession session;
	
	public void searchCity() {
		System.out.println("======= searchCity =======");
		session = MyBatisSqlSessionFactory.openSession();
		
		CityMapper city = session.getMapper(CityMapper.class);
		
		List<City> list = city.selectByExample(new CityExample());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
			if(i == 5) {
				break;
			}
		}
		
		session.close();
	}
	
	public void searchCountry() {
		System.out.println("======= searchCountry =======");
		session = MyBatisSqlSessionFactory.openSession();
		
		CountryMapper country = session.getMapper(CountryMapper.class);
		
		List<Country> list = country.selectByExample(new CountryExample());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
			if(i == 5) {
				break;
			}
		}	
		session.close();
	}
	
	public void searchCountryLanguage() {
		System.out.println("======= searchCountryLanguage =======");
		session = MyBatisSqlSessionFactory.openSession();
		
		CountrylanguageMapper language = session.getMapper(CountrylanguageMapper.class);
		
		List<Countrylanguage> list = language.selectByExample(new CountrylanguageExample());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
			if(i == 5) {
				break;
			}
		}	
		
		session.close();
	}
	
	public void inserCity(String name, String code, String district, Integer pooulation) throws Exception {
		System.out.println("======= inserCity =======");
		session = MyBatisSqlSessionFactory.openSession();
		
		try {
			CityMapper city = session.getMapper(CityMapper.class);
			City example = new City();
			example.setName(name);
			example.setCountrycode(code);
			example.setDistrict(district);
			example.setPopulation(pooulation);
			city.insert(example);
			
			if(1 == 1) {
				throw new Exception("Transaction 錯誤測試!");
			}
			
		} catch (Exception e) {
			session.rollback();
			throw e;
		}
		
		session.commit();
	}
	
	public void searchCityByExample(String name) {
		System.out.println("======= searchCityByExample =======");
		session = MyBatisSqlSessionFactory.openSession();
		
		CityMapper city = session.getMapper(CityMapper.class);
		CityExample example = new CityExample();
		example.createCriteria().andNameEqualTo(name);
		List<City> list = city.selectByExample(example);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(ToStringBuilder.reflectionToString(list.get(i)));
		}
		
	}

	public static void main(String[] args) throws Exception {
		QueryAction query = new QueryAction();
		query.searchCity();
		query.searchCountry();
		query.searchCountryLanguage();
		
		String name = "Taipei10";
		query.inserCity(name, "TWN", "GENM", 56565);
		query.searchCityByExample(name);
	}

}
