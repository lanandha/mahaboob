����   4 L  posorneg/posorneg  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lposorneg/posorneg; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   #enter the number you want to check:
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder . the given number 
 + 0  &
 + 2 3 4 append (I)Ljava/lang/StringBuilder; 6  is positive
 + 8 3 9 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 + ; < = toString ()Ljava/lang/String;
 " ? @ & println B  is negative args [Ljava/lang/String; n I s Ljava/util/Scanner; StackMapTable 
SourceFile posorneg.java !               /     *� �    
                    	       �     V� Y� � M� � !,� '<� !� � +Y-� /� 15� 7� :� >� � � +Y-� /� 1A� 7� :� >�    
   "        	  
   7  :  U          V C D    > E F   K G H  I   
 � :   J    K