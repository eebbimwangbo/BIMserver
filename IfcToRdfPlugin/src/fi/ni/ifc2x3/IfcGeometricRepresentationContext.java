package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.ifc2x3.interfaces.IfcAxis2Placement;

/*
 * IFC Java class
The MIT License (MIT)

Copyright (c) 2014 Jyrki Oraskari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcGeometricRepresentationContext extends IfcRepresentationContext 
{
 // The property attributes
 Long coordinateSpaceDimension;
 Double precision;
IfcAxis2Placement worldCoordinateSystem;
 IfcDirection   trueNorth;
 // The inverse attributes

 InverseLinksList<IfcGeometricRepresentationSubContext> hasSubContexts= new InverseLinksList<IfcGeometricRepresentationSubContext>();


 // Getters and setters of properties

 public Long getCoordinateSpaceDimension() {
   return coordinateSpaceDimension;
 }
 public void setCoordinateSpaceDimension(String txt){
   Long value = i.toLong(txt);
   this.coordinateSpaceDimension=value;

 }

 public Double getPrecision() {
   return precision;
 }
 public void setPrecision(String txt){
   Double value = i.toDouble(txt);
   this.precision=value;

 }

 public IfcAxis2Placement getWorldCoordinateSystem() {
   return worldCoordinateSystem;
 }
 public void setWorldCoordinateSystem(IfcAxis2Placement value){
   this.worldCoordinateSystem=value;

 }

 public IfcDirection getTrueNorth() {
   return trueNorth;

 }
 public void setTrueNorth(IfcDirection value){
   this.trueNorth=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcGeometricRepresentationSubContext> getHasSubContexts() {
   return hasSubContexts;

 }
 public void setHasSubContexts(IfcGeometricRepresentationSubContext value){
   this.hasSubContexts.add(value);

 }

}