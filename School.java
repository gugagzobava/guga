import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class School {
	private HashMap<String, Set<String>> teachersMap;
	private HashMap<String, Set<String>> pupilsMap;
	public School() {
		teachersMap = new HashMap<String, Set<String>>();
		pupilsMap = new HashMap<String, Set<String>>();

	}
	public void addTeacher(String teacher) {
		if (!teachersMap.containsKey(teacher)) {
			teachersMap.put(teacher, new HashSet<String>());
		}
	}
	public void addSubject(String teacher, String subject) {
		if (teachersMap.containsKey(teacher)) {
			teachersMap.get(teacher).add(subject);
		}
	}
	public void addPupil(String pupil, String subject) {
		if (!pupilsMap.containsKey(pupil)) {
			pupilsMap.put(pupil, new HashSet<String>());
		}
		pupilsMap.get(pupil).add(subject);
	}
	public Iterator<String> getTeachers(String pupil) {
		if (pupilsMap.containsKey(pupil)) {
			Set<String> teacherSet = new HashSet<>();
			Set<String> pupilSubjects = pupilsMap.get(pupil);
			for (String subject : pupilSubjects) {
				for (String teacher : teachersMap.keySet()) {
					if (teachersMap.get(teacher).contains(subject)) {
						teacherSet.add(teacher);
					}
				}
			}
			return teacherSet.iterator();
		} else {
			return null;
		}
	}
	public Iterator<String> getPupils(String teacher) {
		if (teachersMap.containsKey(teacher)) {
			Set<String> pupilSet = new HashSet<>();
			Set<String> teacherSubjects = teachersMap.get(teacher);
			for (String subject : teacherSubjects) {
				for (String pupil : pupilsMap.keySet()) {
					if (pupilsMap.get(pupil).contains(subject)) {
						pupilSet.add(pupil);
					}
				}
			}
			return pupilSet.iterator();
		} else {
			return null;
		}
	}
	public void removeTeacher(String teacher) {
		if(teachersMap.containsKey(teacher)){
			teachersMap.remove(teacher);
		}
	}

}