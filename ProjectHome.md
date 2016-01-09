Most Java SAML-related projects, such as <a href='https://spaces.internet2.edu/display/OpenSAML/Home/'>OpenSaml</a>, use interfaces to represent SAML .xsd elements.  This requires you to use factories _everywhere_ in code to instantiate default implementations of those interfaces that rarely change (if ever).  This causes a _tremendous_ amount of boilerplate code that is cumbersome and frustrating to maintain.  SamlBeans exists to eliminate this unnecessary boilerplate.

SamlBeans is a project designed to bring back Plain Old Java usage pattern to working with SAML object graphs s (like the `new` keyword - a novel concept!) instead of being forced to use painful XML factory mechanisms.

This project is open to all interested.  You want committer rights?  Fine.  Just prove a little that your motives are legitimate and you got it.

Because SAML is a Oasis specification, this library is usable by all under an extremely business-friendly license (Apache 2.0).  If you want to help, please join in!

**Have general questions?  Join the**<a href='http://groups.google.com/group/samlbeans-user'>User list</a>
**Want to help develop? Join the**<a href='http://groups.google.com/group/samlbeans-dev'>Developer list</a>