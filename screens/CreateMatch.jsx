import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';

export default function CreateMatch({ navigation }) {
  return (
    <View style={styles.container}>
      <Text>Marcando partida...</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: '0.5rem',
  },
  button: {
    padding: '1rem',
    backgroundColor: 'white',
    borderBottomWidth: '2px',
    borderColor: 'grey',
  },
});
