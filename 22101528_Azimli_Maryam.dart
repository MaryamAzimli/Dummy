void main() {
//using curly braces
  var subject = {
    'class_name': "Programming Languages",
    'class_faculty': "CS",
    'class_number': 315,
    'class_professor': 'H. Altay Guvenir'
  };

  subject['class_classroom'] = 'EB-204';
  subject.remove('class_number');
  subject['class_professor'] = 'Altay Guvenir';

  //get the value for the given key
  print('Getting values for maps created with curly braces: ');
  print('Class Name: ${subject['class_name']}');
  print('Class Faculty: ${subject['class_faculty']}');
  print('Class Number: ${subject['class_number']}');
  print('Class Professor: ${subject['class_professor']}');
  print('Class classroom: ${subject['class_classroom']}\n');

  if (subject.containsKey('class_number')) {
    print('Subject has class_number key.');
  } else {
    print('Subject does not have class_number key.');
  }

  if (subject.containsValue('CS')) {
    print('Subject has value "CS".');
  } else {
    print('Subject does not have value "CS".\n');
  }

  void foo(key, value) {
    print('$key: $value');
  }

  // Loop through the map and apply foo function to each key-value pair
  subject.forEach((key, value) {
    foo(key, value);
  });

  //using Map constructor
  var subject2 = Map<String, dynamic>();
  subject2['class_name'] = 'Programming Languages';
  subject2['class_faculty'] = 'CS';
  subject2['class_number'] = 315;
  subject2['class_professor'] = 'H. Altay Guvenir';

  // get the value for the given key
  print('\nGetting values for maps created with Map constructor: ');
  print('Class Name: ${subject2['class_name']}');
  print('Class Faculty: ${subject2['class_faculty']}');
  print('Class Number: ${subject2['class_number']}');
  print('Class Professor: ${subject2['class_professor']}\n');
}
