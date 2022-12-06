import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';

export default function Card({ post }) {
  return (
    <View>
      <Text>{post.title}</Text>
    </View>
  );
}
