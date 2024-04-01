package factory.pattern;

public class ProfessionFactory {

	public Profession getProfession(String typeOfProfession) {
		if (typeOfProfession == null) {
			return null;
		}
		
		if ("Doctor".equalsIgnoreCase(typeOfProfession)) {
			return new Doctor();
		} else if ("Engineer".equalsIgnoreCase(typeOfProfession)) {
			return new Engineer();
		} else if ("Teacher".equalsIgnoreCase(typeOfProfession)) {
			return new Teacher();
		}
		
		return null;
	}
}
