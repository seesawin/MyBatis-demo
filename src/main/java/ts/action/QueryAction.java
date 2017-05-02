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

	public static void main(String[] args) {
		QueryAction query = new QueryAction();
		query.searchCity();
		query.searchCountry();
		query.searchCountryLanguage();
	}

}
