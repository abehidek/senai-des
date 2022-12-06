import React from "react";
import { Image, StyleSheet, Text, View, TouchableOpacity, TextInput } from 'react-native';
import logo from '../assets/favicon.png';
// import { useQuery } from 'react-query'

export default function SignUp({ navigation }) {
  const [name, onChangeName] = React.useState("");
  const [age, onChangeAge] = React.useState("");
  const [email, onChangeEmail] = React.useState("");
  const [password, onChangePassword] = React.useState("");
  const [deficiency, onChangeDeficiency] = React.useState("");
  return (
    <View style={styles.container}>
      <Image source={logo} style={{ width: 50, height: 50 }}/>
      <View style={{ gap: '2rem', width: '100%'}}>
        <View style={styles.inputActions}>
          <TextInput
            style={styles.input}
            value={name}
            placeholder="Digite seu nome aqui"
            onChangeText={onChangeName}
          />
          <TextInput
            style={styles.input}
            value={age}
            placeholder="Digite sua idade aqui"
            onChangeText={onChangeAge}
          />
          <TextInput
            style={styles.input}
            value={email}
            placeholder="Digite seu email aqui"
            onChangeText={onChangeEmail}
          />
          <TextInput
            style={styles.input}
            value={password}
            placeholder="Digite sua senha aqui"
            onChangeText={onChangePassword}
          />
          <TextInput
            style={styles.input}
            value={deficiency}
            placeholder="Digite sua deficiencia aqui"
            onChangeText={onChangeDeficiency}
          />

        </View>

        <View style={styles.buttonActions}>
          <TouchableOpacity style={styles.button} onPress={() => { alert("Cadastrando...") }}>
            <Text>Cadastrar</Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.button} onPress={() => { navigation.navigate('Login') }}>
            <Text>Voltar e fazer login</Text>
          </TouchableOpacity>
        </View>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: '0.5rem',
    display: 'flex',
    justifyContent: 'space-evenly',
    alignItems: 'center',
    height: '100vh',
  },
  button: {
    padding: '1rem',
    backgroundColor: 'grey',
    borderRadius: '0.5rem',
  },
  buttonActions: {
    width: '100%',
    display: 'flex',
    gap: '0.5rem',
    justifyContent: 'space-between',
  },
  input: {
    padding: '1rem',
    width: '100%',
    borderWidth: '2px',
  },
  inputActions: {
    display: 'flex',
    gap: '1rem',
    width: '100%',
  },
});

