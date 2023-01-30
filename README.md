# Learning EJB Enterprise Java Bean Concepts.
<p align="center">
<img src="https://user-images.githubusercontent.com/89584431/215599807-f2b0326b-0325-4e67-b562-41b843bdfa5f.png" alt="logo-java-runtime-environment-programming-language-java">
</p>

# What is EJB
EJB stands for Enterprise Java Bean, a specification provided by Sun Microsystems for developing secured, robust and scalable distributed applications.

EJB applications require an application server (EJB Container) to run, such as Jboss, Glassfish, Weblogic, Websphere, etc. The EJB Container performs functions such as life cycle management, security, transaction management, and object pooling.

EJB is similar to the Component Object Model (COM) provided by Microsoft but different from Java Bean, RMI, and Web Services.

Enterprise Java Beans are used in applications that require remote access (i.e. distributed), scalability, and encapsulated business logic.

## Types of Enterprise Java Bean
There are 3 types:
- Session Bean: contains business logic that can be invoked by local, remote, or webservice client.
- Message Driven Bean: contains business logic that is invoked by passing a message.
- Entity Bean: encapsulates the state that can be persisted in the database, but has been deprecated and replaced with JPA (Java Persistent API).


![types-of-enterprise-bean](https://user-images.githubusercontent.com/89584431/215598026-0ebf01d5-3d16-468b-9f7d-cfca5b8ca0f2.jpg)
