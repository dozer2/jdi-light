(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[213],{17812:function(e,t,r){"use strict";var a=r(87462),n=r(45987),l=r(67294),i=(r(45697),r(86010)),o=r(1591),d=r(59693),s=r(4024),u=r(93871),c=l.forwardRef((function(e,t){var r=e.edge,o=void 0!==r&&r,d=e.children,c=e.classes,p=e.className,h=e.color,m=void 0===h?"default":h,v=e.disabled,f=void 0!==v&&v,b=e.disableFocusRipple,x=void 0!==b&&b,g=e.size,Z=void 0===g?"medium":g,y=(0,n.Z)(e,["edge","children","classes","className","color","disabled","disableFocusRipple","size"]);return l.createElement(s.Z,(0,a.Z)({className:(0,i.Z)(c.root,p,"default"!==m&&c["color".concat((0,u.Z)(m))],f&&c.disabled,"small"===Z&&c["size".concat((0,u.Z)(Z))],{start:c.edgeStart,end:c.edgeEnd}[o]),centerRipple:!0,focusRipple:!x,disabled:f,ref:t},y),l.createElement("span",{className:c.label},d))}));t.Z=(0,o.Z)((function(e){return{root:{textAlign:"center",flex:"0 0 auto",fontSize:e.typography.pxToRem(24),padding:12,borderRadius:"50%",overflow:"visible",color:e.palette.action.active,transition:e.transitions.create("background-color",{duration:e.transitions.duration.shortest}),"&:hover":{backgroundColor:(0,d.U1)(e.palette.action.active,e.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:"transparent"}},"&$disabled":{backgroundColor:"transparent",color:e.palette.action.disabled}},edgeStart:{marginLeft:-12,"$sizeSmall&":{marginLeft:-3}},edgeEnd:{marginRight:-12,"$sizeSmall&":{marginRight:-3}},colorInherit:{color:"inherit"},colorPrimary:{color:e.palette.primary.main,"&:hover":{backgroundColor:(0,d.U1)(e.palette.primary.main,e.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:"transparent"}}},colorSecondary:{color:e.palette.secondary.main,"&:hover":{backgroundColor:(0,d.U1)(e.palette.secondary.main,e.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:"transparent"}}},disabled:{},sizeSmall:{padding:3,fontSize:e.typography.pxToRem(18)},label:{width:"100%",display:"flex",alignItems:"inherit",justifyContent:"inherit"}}}),{name:"MuiIconButton"})(c)},7397:function(e,t,r){"use strict";var a=r(87462),n=r(45987),l=r(67294),i=(r(45697),r(86010)),o=r(22318),d=r(1591),s=r(15736),u=l.forwardRef((function(e,t){var r=e.children,d=e.classes,u=e.className,c=e.component,p=void 0===c?"div":c,h=e.disablePointerEvents,m=void 0!==h&&h,v=e.disableTypography,f=void 0!==v&&v,b=e.position,x=e.variant,g=(0,n.Z)(e,["children","classes","className","component","disablePointerEvents","disableTypography","position","variant"]),Z=(0,s.Y)()||{},y=x;return x&&Z.variant,Z&&!y&&(y=Z.variant),l.createElement(s.Z.Provider,{value:null},l.createElement(p,(0,a.Z)({className:(0,i.Z)(d.root,u,m&&d.disablePointerEvents,Z.hiddenLabel&&d.hiddenLabel,"filled"===y&&d.filled,{start:d.positionStart,end:d.positionEnd}[b],"dense"===Z.margin&&d.marginDense),ref:t},g),"string"!==typeof r||f?r:l.createElement(o.Z,{color:"textSecondary"},r)))}));t.Z=(0,d.Z)({root:{display:"flex",height:"0.01em",maxHeight:"2em",alignItems:"center",whiteSpace:"nowrap"},filled:{"&$positionStart:not($hiddenLabel)":{marginTop:16}},positionStart:{marginRight:8},positionEnd:{marginLeft:8},disablePointerEvents:{pointerEvents:"none"},hiddenLabel:{},marginDense:{}},{name:"MuiInputAdornment"})(u)},85639:function(e,t,r){"use strict";var a=r(45987),n=r(4942),l=r(87462),i=r(67294),o=(r(45697),r(86010)),d=r(1591),s=r(50998),u=i.forwardRef((function(e,t){var r,n=e.classes,d=e.className,u=e.component,c=void 0===u?"li":u,p=e.disableGutters,h=void 0!==p&&p,m=e.ListItemClasses,v=e.role,f=void 0===v?"menuitem":v,b=e.selected,x=e.tabIndex,g=(0,a.Z)(e,["classes","className","component","disableGutters","ListItemClasses","role","selected","tabIndex"]);return e.disabled||(r=void 0!==x?x:-1),i.createElement(s.Z,(0,l.Z)({button:!0,role:f,tabIndex:r,component:c,selected:b,disableGutters:h,classes:(0,l.Z)({dense:n.dense},m),className:(0,o.Z)(n.root,d,b&&n.selected,!h&&n.gutters),ref:t},g))}));t.Z=(0,d.Z)((function(e){return{root:(0,l.Z)({},e.typography.body1,(0,n.Z)({minHeight:48,paddingTop:6,paddingBottom:6,boxSizing:"border-box",width:"auto",overflow:"hidden",whiteSpace:"nowrap"},e.breakpoints.up("sm"),{minHeight:"auto"})),gutters:{},selected:{},dense:(0,l.Z)({},e.typography.body2,{minHeight:"auto"})}}),{name:"MuiMenuItem"})(u)},39803:function(e,t,r){"use strict";var a=r(87462),n=r(45987),l=r(67294),i=(r(45697),r(86010)),o=r(38799),d=r(59446),s=r(74061),u=r(96394),c=r(64436),p=r(30585),h=r(55296),m=r(1591),v={standard:o.Z,filled:d.Z,outlined:s.Z},f=l.forwardRef((function(e,t){var r=e.autoComplete,o=e.autoFocus,d=void 0!==o&&o,s=e.children,m=e.classes,f=e.className,b=e.color,x=void 0===b?"primary":b,g=e.defaultValue,Z=e.disabled,y=void 0!==Z&&Z,w=e.error,j=void 0!==w&&w,P=e.FormHelperTextProps,E=e.fullWidth,C=void 0!==E&&E,S=e.helperText,N=e.hiddenLabel,F=e.id,R=e.InputLabelProps,T=e.inputProps,I=e.InputProps,M=e.inputRef,k=e.label,L=e.multiline,z=void 0!==L&&L,O=e.name,V=e.onBlur,W=e.onChange,_=e.onFocus,H=e.placeholder,A=e.required,D=void 0!==A&&A,q=e.rows,$=e.rowsMax,B=e.select,U=void 0!==B&&B,G=e.SelectProps,K=e.type,X=e.value,Y=e.variant,J=void 0===Y?"standard":Y,Q=(0,n.Z)(e,["autoComplete","autoFocus","children","classes","className","color","defaultValue","disabled","error","FormHelperTextProps","fullWidth","helperText","hiddenLabel","id","InputLabelProps","inputProps","InputProps","inputRef","label","multiline","name","onBlur","onChange","onFocus","placeholder","required","rows","rowsMax","select","SelectProps","type","value","variant"]);var ee={};if("outlined"===J&&(R&&"undefined"!==typeof R.shrink&&(ee.notched=R.shrink),k)){var te,re=null!==(te=null===R||void 0===R?void 0:R.required)&&void 0!==te?te:D;ee.label=l.createElement(l.Fragment,null,k,re&&"\xa0*")}U&&(G&&G.native||(ee.id=void 0),ee["aria-describedby"]=void 0);var ae=S&&F?"".concat(F,"-helper-text"):void 0,ne=k&&F?"".concat(F,"-label"):void 0,le=v[J],ie=l.createElement(le,(0,a.Z)({"aria-describedby":ae,autoComplete:r,autoFocus:d,defaultValue:g,fullWidth:C,multiline:z,name:O,rows:q,rowsMax:$,type:K,value:X,id:F,inputRef:M,onBlur:V,onChange:W,onFocus:_,placeholder:H,inputProps:T},ee,I));return l.createElement(c.Z,(0,a.Z)({className:(0,i.Z)(m.root,f),disabled:y,error:j,fullWidth:C,hiddenLabel:N,ref:t,required:D,color:x,variant:J},Q),k&&l.createElement(u.Z,(0,a.Z)({htmlFor:F,id:ne},R),k),U?l.createElement(h.Z,(0,a.Z)({"aria-describedby":ae,id:F,labelId:ne,value:X,input:ie},G),s):ie,S&&l.createElement(p.Z,(0,a.Z)({id:ae},P),S))}));t.Z=(0,m.Z)({root:{}},{name:"MuiTextField"})(f)},20067:function(e,t,r){"use strict";var a=r(95318),n=r(20862);t.Z=void 0;var l=n(r(67294)),i=(0,a(r(2108)).default)(l.createElement("path",{d:"M12 4.5C7 4.5 2.73 7.61 1 12c1.73 4.39 6 7.5 11 7.5s9.27-3.11 11-7.5c-1.73-4.39-6-7.5-11-7.5zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5zm0-8c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3z"}),"Visibility");t.Z=i},28270:function(e,t,r){"use strict";var a=r(95318),n=r(20862);t.Z=void 0;var l=n(r(67294)),i=(0,a(r(2108)).default)(l.createElement("path",{d:"M12 7c2.76 0 5 2.24 5 5 0 .65-.13 1.26-.36 1.83l2.92 2.92c1.51-1.26 2.7-2.89 3.43-4.75-1.73-4.39-6-7.5-11-7.5-1.4 0-2.74.25-3.98.7l2.16 2.16C10.74 7.13 11.35 7 12 7zM2 4.27l2.28 2.28.46.46C3.08 8.3 1.78 10.02 1 12c1.73 4.39 6 7.5 11 7.5 1.55 0 3.03-.3 4.38-.84l.42.42L19.73 22 21 20.73 3.27 3 2 4.27zM7.53 9.8l1.55 1.55c-.05.21-.08.43-.08.65 0 1.66 1.34 3 3 3 .22 0 .44-.03.65-.08l1.55 1.55c-.67.33-1.41.53-2.2.53-2.76 0-5-2.24-5-5 0-.79.2-1.53.53-2.2zm4.31-.78l3.15 3.15.02-.16c0-1.66-1.34-3-3-3l-.17.01z"}),"VisibilityOff");t.Z=i},47807:function(e,t,r){(window.__NEXT_P=window.__NEXT_P||[]).push(["/text_field",function(){return r(9907)}])},9907:function(e,t,r){"use strict";r.r(t),r.d(t,{default:function(){return E}});var a=r(85893),n=r(67294),l=r(43832),i=r(7560),o=r(39803),d=r(41120),s=r(85639),u=r(86010),c=r(17812),p=r(38799),h=r(96394),m=r(7397),v=r(30585),f=r(64436),b=r(20067),x=r(28270);function g(e,t,r){return t in e?Object.defineProperty(e,t,{value:r,enumerable:!0,configurable:!0,writable:!0}):e[t]=r,e}function Z(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{},a=Object.keys(r);"function"===typeof Object.getOwnPropertySymbols&&(a=a.concat(Object.getOwnPropertySymbols(r).filter((function(e){return Object.getOwnPropertyDescriptor(r,e).enumerable})))),a.forEach((function(t){g(e,t,r[t])}))}return e}function y(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var r=[],a=!0,n=!1,l=void 0;try{for(var i,o=e[Symbol.iterator]();!(a=(i=o.next()).done)&&(r.push(i.value),!t||r.length!==t);a=!0);}catch(d){n=!0,l=d}finally{try{a||null==o.return||o.return()}finally{if(n)throw l}}return r}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance")}()}var w=[{value:"USD",label:"$"},{value:"EUR",label:"\u20ac"},{value:"BTC",label:"\u0e3f"},{value:"JPY",label:"\xa5"}],j=(0,d.Z)((function(e){return{root:{"& .MuiTextField-root":{margin:e.spacing(1),width:"25ch"},textField:{marginLeft:e.spacing(1),marginRight:e.spacing(1),width:"25ch"}}}}));function P(){var e=j(),t=y(n.useState("EUR"),2),r=t[0],l=t[1],i=y(n.useState("Controlled"),2),d=(i[0],i[1],function(e){l(e.target.value)}),P=y(n.useState({amount:"",password:"",weight:"",weightRange:"",showPassword:!1}),2),E=P[0],C=P[1],S=function(e){return function(t){C(Z({},E,g({},e,t.target.value)))}};return(0,a.jsxs)("div",{children:[(0,a.jsx)("h1",{children:"Text Fields"}),(0,a.jsx)("h2",{children:"Form props"}),(0,a.jsxs)("form",{className:e.root,noValidate:!0,autoComplete:"off",id:"formProps",children:[(0,a.jsxs)("div",{children:[(0,a.jsx)(o.Z,{required:!0,id:"standard-required",label:"Required",defaultValue:"Hello World"}),(0,a.jsx)(o.Z,{disabled:!0,id:"standard-disabled",label:"Disabled",defaultValue:"Hello World"}),(0,a.jsx)(o.Z,{id:"standard-password-input",label:"Password",type:"password",autoComplete:"current-password"}),(0,a.jsx)(o.Z,{id:"standard-read-only-input",label:"Read Only",defaultValue:"Hello World",InputProps:{readOnly:!0}}),(0,a.jsx)(o.Z,{id:"standard-number",label:"Number",type:"number",InputLabelProps:{shrink:!0}}),(0,a.jsx)(o.Z,{id:"standard-search",label:"Search field",type:"search"}),(0,a.jsx)(o.Z,{id:"standard-helperText",label:"Helper text",defaultValue:"Default Value",helperText:"Some important text"})]}),(0,a.jsx)("h2",{children:"Validation"}),(0,a.jsxs)("div",{children:[(0,a.jsx)(o.Z,{error:!0,id:"filled-error",label:"Error",defaultValue:"Hello World",variant:"filled"}),(0,a.jsx)(o.Z,{error:!0,id:"filled-error-helper-text",label:"Error",defaultValue:"Hello World",helperText:"Incorrect entry.",variant:"filled"})]}),(0,a.jsx)("h2",{children:"Multiline"}),(0,a.jsxs)("div",{children:[(0,a.jsx)(o.Z,{id:"outlined-multiline-flexible",label:"Multiline",multiline:!0,rowsMax:4,value:r,onChange:d,variant:"outlined"}),(0,a.jsx)(o.Z,{id:"outlined-textarea",label:"Multiline Placeholder",placeholder:"Placeholder",multiline:!0,variant:"outlined"}),(0,a.jsx)(o.Z,{id:"outlined-multiline-static",label:"Multiline",multiline:!0,rows:4,defaultValue:"Default Value",variant:"outlined"})]}),(0,a.jsx)("h2",{children:"Select"}),(0,a.jsxs)("div",{children:[(0,a.jsx)(o.Z,{id:"outlined-select-currency",select:!0,label:"Select",value:r,onChange:d,helperText:"Please select your currency",variant:"outlined",children:w.map((function(e){return(0,a.jsx)(s.Z,{value:e.value,children:e.label},e.value)}))}),(0,a.jsx)(o.Z,{id:"outlined-select-currency-native",select:!0,label:"Native select",value:r,onChange:d,SelectProps:{native:!0},helperText:"Please select your currency",variant:"outlined",children:w.map((function(e){return(0,a.jsx)("option",{value:e.value,children:e.label},e.value)}))})]}),(0,a.jsx)("h2",{children:"Input Adornments"}),(0,a.jsxs)("div",{children:[(0,a.jsx)(o.Z,{label:"With normal TextField",id:"standard-start-adornment",className:(0,u.Z)(e.margin,e.textField),InputProps:{startAdornment:(0,a.jsx)(m.Z,{position:"start",children:"Kg"})}}),(0,a.jsxs)(f.Z,{className:(0,u.Z)(e.margin,e.withoutLabel,e.textField),children:[(0,a.jsx)(p.Z,{id:"standard-adornment-weight",value:E.weight,onChange:S("weight"),endAdornment:(0,a.jsx)(m.Z,{position:"end",children:"Kg"}),"aria-describedby":"standard-weight-helper-text",inputProps:{"aria-label":"weight"}}),(0,a.jsx)(v.Z,{id:"standard-weight-helper-text",children:"Weight"})]}),(0,a.jsxs)(f.Z,{className:(0,u.Z)(e.margin,e.textField),children:[(0,a.jsx)(h.Z,{htmlFor:"standard-adornment-password",children:"Password"}),(0,a.jsx)(p.Z,{id:"standard-adornment-password",type:E.showPassword?"text":"password",value:E.password,onChange:S("password"),endAdornment:(0,a.jsx)(m.Z,{position:"end",children:(0,a.jsx)(c.Z,{"aria-label":"toggle password visibility",onClick:function(){C(Z({},E,{showPassword:!E.showPassword}))},onMouseDown:function(e){e.preventDefault()},children:E.showPassword?(0,a.jsx)(b.Z,{}):(0,a.jsx)(x.Z,{})})})})]}),(0,a.jsxs)(f.Z,{fullWidth:!0,className:e.margin,children:[(0,a.jsx)(h.Z,{htmlFor:"standard-adornment-amount",children:"Amount"}),(0,a.jsx)(p.Z,{id:"standard-adornment-amount",value:E.amount,onChange:S("amount"),startAdornment:(0,a.jsx)(m.Z,{position:"start",children:"$"})})]})]})]})]})}function E(){return(0,a.jsx)(l.Z,{maxWidth:"xl",children:(0,a.jsx)(i.Z,{my:4,children:(0,a.jsx)(P,{})})})}}},function(e){e.O(0,[5770,6517,7815,8396,4681,9157,566,9774,2888,179],(function(){return t=47807,e(e.s=t);var t}));var t=e.O();_N_E=t}]);