(window.webpackJsonp=window.webpackJsonp||[]).push([[63],{1018:function(o,r,t){"use strict";t.r(r);var e={data:function(){return{ex7:"red",ex8:"primary"}}},n=t(74),l=t(169),d=t.n(l),v=t(378),c=t(355),_=t(953),f=t(1040),m=t(732),x=t(733),k=t(409),component=Object(n.a)(e,(function(){var o=this,r=o.$createElement,t=o._self._c||r;return t("v-card",{attrs:{flat:""}},[t("v-card-text",[t("v-container",{attrs:{fluid:""}},[t("v-row",[t("v-col",{attrs:{cols:"12",sm:"6",md:"6"}},[t("v-radio-group",{attrs:{column:""},model:{value:o.ex7,callback:function(r){o.ex7=r},expression:"ex7"}},[t("v-radio",{attrs:{label:"red",color:"red",value:"red"}}),o._v(" "),t("v-radio",{attrs:{label:"red darken-3",color:"red darken-3",value:"red darken-3"}}),o._v(" "),t("v-radio",{attrs:{label:"indigo",color:"indigo",value:"indigo"}}),o._v(" "),t("v-radio",{attrs:{label:"indigo darken-3",color:"indigo darken-3",value:"indigo darken-3"}}),o._v(" "),t("v-radio",{attrs:{label:"orange",color:"orange",value:"orange"}}),o._v(" "),t("v-radio",{attrs:{label:"orange darken-3",color:"orange darken-3",value:"orange darken-3"}})],1)],1),o._v(" "),t("v-col",{attrs:{cols:"12",sm:"6",md:"6"}},[t("v-radio-group",{attrs:{column:""},model:{value:o.ex8,callback:function(r){o.ex8=r},expression:"ex8"}},[t("v-radio",{attrs:{label:"primary",color:"primary",value:"primary"}}),o._v(" "),t("v-radio",{attrs:{label:"secondary",color:"secondary",value:"secondary"}}),o._v(" "),t("v-radio",{attrs:{label:"success",color:"success",value:"success"}}),o._v(" "),t("v-radio",{attrs:{label:"info",color:"info",value:"info"}}),o._v(" "),t("v-radio",{attrs:{label:"warning",color:"warning",value:"warning"}}),o._v(" "),t("v-radio",{attrs:{label:"error",color:"error",value:"error"}})],1)],1)],1)],1)],1)],1)}),[],!1,null,null,null),R=component.exports;d()(component,{VCard:v.a,VCardText:c.c,VCol:_.a,VContainer:f.a,VRadio:m.a,VRadioGroup:x.a,VRow:k.a});var y={data:function(){return{column:null,row:null}}},C=Object(n.a)(y,(function(){var o=this,r=o.$createElement,t=o._self._c||r;return t("v-container",{attrs:{fluid:""}},[t("v-radio-group",{attrs:{column:""},model:{value:o.column,callback:function(r){o.column=r},expression:"column"}},[t("v-radio",{attrs:{label:"Option 1",value:"radio-1"}}),o._v(" "),t("v-radio",{attrs:{label:"Option 2",value:"radio-2"}})],1),o._v(" "),t("hr"),o._v(" "),t("v-radio-group",{attrs:{row:""},model:{value:o.row,callback:function(r){o.row=r},expression:"row"}},[t("v-radio",{attrs:{label:"Option 1",value:"radio-1"}}),o._v(" "),t("v-radio",{attrs:{label:"Option 2",value:"radio-2"}})],1)],1)}),[],!1,null,null,null),w=C.exports;d()(C,{VContainer:f.a,VRadio:m.a,VRadioGroup:x.a});var V={data:function(){return{radios:null}}},h=Object(n.a)(V,(function(){var o=this,r=o.$createElement,t=o._self._c||r;return t("v-container",{attrs:{fluid:""}},[t("p",[o._v(o._s(o.radios||"null"))]),o._v(" "),t("v-radio-group",{attrs:{mandatory:""},model:{value:o.radios,callback:function(r){o.radios=r},expression:"radios"}},[t("v-radio",{attrs:{label:"Radio 1",value:"radio-1"}}),o._v(" "),t("v-radio",{attrs:{label:"Radio 2",value:"radio-2"}})],1)],1)}),[],!1,null,null,null),B=h.exports;d()(h,{VContainer:f.a,VRadio:m.a,VRadioGroup:x.a});var O={data:function(){return{radios:"Duckduckgo"}}},D=Object(n.a)(O,(function(){var o=this,r=o.$createElement,t=o._self._c||r;return t("v-container",{attrs:{fluid:""}},[t("v-radio-group",{scopedSlots:o._u([{key:"label",fn:function(){return[t("div",[o._v("Your favourite "),t("strong",[o._v("search engine")])])]},proxy:!0}]),model:{value:o.radios,callback:function(r){o.radios=r},expression:"radios"}},[o._v(" "),t("v-radio",{attrs:{value:"Google"},scopedSlots:o._u([{key:"label",fn:function(){return[t("div",[o._v("Of course it's "),t("strong",{staticClass:"success--text"},[o._v("Google")])])]},proxy:!0}])}),o._v(" "),t("v-radio",{attrs:{value:"Duckduckgo"},scopedSlots:o._u([{key:"label",fn:function(){return[t("div",[o._v("Definitely "),t("strong",{staticClass:"primary--text"},[o._v("Duckduckgo")])])]},proxy:!0}])})],1)],1)}),[],!1,null,null,null),G=D.exports;d()(D,{VContainer:f.a,VRadio:m.a,VRadioGroup:x.a});var j={name:"RadioButtons",components:{ColorsRadioButton:R,DirectionRadioButton:w,MandatoryRadioButton:B,LabelRadioButton:G}},E=Object(n.a)(j,(function(){var o=this,r=o.$createElement,t=o._self._c||r;return t("v-container",[t("v-col",[t("h1",[o._v("Radio buttons")]),o._v(" "),t("p",{staticClass:"body-1 mt-2"},[o._v("\n            The "),t("code",[o._v("v-radio")]),o._v(" component is a simple radio button. \n            When combined with the "),t("code",[o._v("v-radio-group")]),o._v(" component you can provide groupable functionality \n            to allow users to select from a predefined set of options.\n        ")])]),o._v(" "),t("v-col",[t("p",{staticClass:"text-h5"},[o._v("\n            Colors radio button\n        ")]),o._v(" "),t("ColorsRadioButton",{attrs:{id:"ColorsRadioButton"}})],1),o._v(" "),t("v-col",[t("p",{staticClass:"text-h5"},[o._v("\n            Direction radio button\n        ")]),o._v(" "),t("DirectionRadioButton",{attrs:{id:"DirectionRadioButton"}})],1),o._v(" "),t("v-col",[t("p",{staticClass:"text-h5"},[o._v("\n            Mandatory radio button\n        ")]),o._v(" "),t("MandatoryRadioButton",{attrs:{id:"MandatoryRadioButton"}})],1),o._v(" "),t("v-col",[t("p",{staticClass:"text-h5"},[o._v("\n            Label radio button\n        ")]),o._v(" "),t("LabelRadioButton",{attrs:{id:"LabelRadioButton"}})],1)],1)}),[],!1,null,null,null);r.default=E.exports;d()(E,{VCol:_.a,VContainer:f.a})}}]);