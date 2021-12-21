"use strict";(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[4184],{52795:function(e,t,r){var n=r(67294),o=r(73935),i=(r(45697),r(30626)),a=r(17294),u=r(55192);function c(e){return e.substring(2).toLowerCase()}t.Z=function(e){var t=e.children,r=e.disableReactTree,l=void 0!==r&&r,s=e.mouseEvent,p=void 0===s?"onClick":s,m=e.onClickAway,f=e.touchEvent,d=void 0===f?"onTouchEnd":f,v=n.useRef(!1),h=n.useRef(null),g=n.useRef(!1),T=n.useRef(!1);n.useEffect((function(){return setTimeout((function(){g.current=!0}),0),function(){g.current=!1}}),[]);var b=n.useCallback((function(e){h.current=o.findDOMNode(e)}),[]),Z=(0,a.Z)(t.ref,b),y=(0,u.Z)((function(e){var t=T.current;if(T.current=!1,g.current&&h.current&&!function(e){return document.documentElement.clientWidth<e.clientX||document.documentElement.clientHeight<e.clientY}(e))if(v.current)v.current=!1;else{var r;if(e.composedPath)r=e.composedPath().indexOf(h.current)>-1;else r=!(0,i.Z)(h.current).documentElement.contains(e.target)||h.current.contains(e.target);r||!l&&t||m(e)}})),E=function(e){return function(r){T.current=!0;var n=t.props[e];n&&n(r)}},w={ref:Z};return!1!==d&&(w[d]=E(d)),n.useEffect((function(){if(!1!==d){var e=c(d),t=(0,i.Z)(h.current),r=function(){v.current=!0};return t.addEventListener(e,y),t.addEventListener("touchmove",r),function(){t.removeEventListener(e,y),t.removeEventListener("touchmove",r)}}}),[y,d]),!1!==p&&(w[p]=E(p)),n.useEffect((function(){if(!1!==p){var e=c(p),t=(0,i.Z)(h.current);return t.addEventListener(e,y),function(){t.removeEventListener(e,y)}}}),[y,p]),n.createElement(n.Fragment,null,n.cloneElement(t,w))}},868:function(e,t,r){var n=r(87462),o=r(97685),i=r(45987),a=r(4942),u=r(67294),c=r(73935),l=(r(45697),r(86010)),s=r(35953),p=r(59693),m=r(1591),f=r(93871),d=r(20170),v=r(84872),h=r(17294),g=r(95001),T=r(34236),b=r(24896),Z=r(22775),y=r(8920);function E(e){return Math.round(1e5*e)/1e5}var w=!1,x=null;var L=u.forwardRef((function(e,t){var r=e.arrow,a=void 0!==r&&r,p=e.children,m=e.classes,E=e.disableFocusListener,L=void 0!==E&&E,R=e.disableHoverListener,O=void 0!==R&&R,P=e.disableTouchListener,k=void 0!==P&&P,C=e.enterDelay,M=void 0===C?100:C,D=e.enterNextDelay,N=void 0===D?0:D,F=e.enterTouchDelay,B=void 0===F?700:F,S=e.id,z=e.interactive,H=void 0!==z&&z,W=e.leaveDelay,A=void 0===W?0:W,I=e.leaveTouchDelay,V=void 0===I?1500:I,$=e.onClose,_=e.onOpen,U=e.open,X=e.placement,Y=void 0===X?"bottom":X,j=e.PopperComponent,q=void 0===j?v.Z:j,G=e.PopperProps,J=e.title,K=e.TransitionComponent,Q=void 0===K?d.Z:K,ee=e.TransitionProps,te=(0,i.Z)(e,["arrow","children","classes","disableFocusListener","disableHoverListener","disableTouchListener","enterDelay","enterNextDelay","enterTouchDelay","id","interactive","leaveDelay","leaveTouchDelay","onClose","onOpen","open","placement","PopperComponent","PopperProps","title","TransitionComponent","TransitionProps"]),re=(0,y.Z)(),ne=u.useState(),oe=ne[0],ie=ne[1],ae=u.useState(null),ue=ae[0],ce=ae[1],le=u.useRef(!1),se=u.useRef(),pe=u.useRef(),me=u.useRef(),fe=u.useRef(),de=(0,Z.Z)({controlled:U,default:!1,name:"Tooltip",state:"open"}),ve=(0,o.Z)(de,2),he=ve[0],ge=ve[1],Te=he,be=(0,g.Z)(S);u.useEffect((function(){return function(){clearTimeout(se.current),clearTimeout(pe.current),clearTimeout(me.current),clearTimeout(fe.current)}}),[]);var Ze=function(e){clearTimeout(x),w=!0,ge(!0),_&&_(e)},ye=function(){var e=!(arguments.length>0&&void 0!==arguments[0])||arguments[0];return function(t){var r=p.props;"mouseover"===t.type&&r.onMouseOver&&e&&r.onMouseOver(t),le.current&&"touchstart"!==t.type||(oe&&oe.removeAttribute("title"),clearTimeout(pe.current),clearTimeout(me.current),M||w&&N?(t.persist(),pe.current=setTimeout((function(){Ze(t)}),w?N:M)):Ze(t))}},Ee=(0,b.Z)(),we=Ee.isFocusVisible,xe=Ee.onBlurVisible,Le=Ee.ref,Re=u.useState(!1),Oe=Re[0],Pe=Re[1],ke=function(){Oe&&(Pe(!1),xe())},Ce=function(){var e=!(arguments.length>0&&void 0!==arguments[0])||arguments[0];return function(t){oe||ie(t.currentTarget),we(t)&&(Pe(!0),ye()(t));var r=p.props;r.onFocus&&e&&r.onFocus(t)}},Me=function(e){clearTimeout(x),x=setTimeout((function(){w=!1}),800+A),ge(!1),$&&$(e),clearTimeout(se.current),se.current=setTimeout((function(){le.current=!1}),re.transitions.duration.shortest)},De=function(){var e=!(arguments.length>0&&void 0!==arguments[0])||arguments[0];return function(t){var r=p.props;"blur"===t.type&&(r.onBlur&&e&&r.onBlur(t),ke()),"mouseleave"===t.type&&r.onMouseLeave&&t.currentTarget===oe&&r.onMouseLeave(t),clearTimeout(pe.current),clearTimeout(me.current),t.persist(),me.current=setTimeout((function(){Me(t)}),A)}},Ne=function(e){le.current=!0;var t=p.props;t.onTouchStart&&t.onTouchStart(e)},Fe=(0,h.Z)(ie,t),Be=(0,h.Z)(Le,Fe),Se=u.useCallback((function(e){(0,T.Z)(Be,c.findDOMNode(e))}),[Be]),ze=(0,h.Z)(p.ref,Se);""===J&&(Te=!1);var He=!Te&&!O,We=(0,n.Z)({"aria-describedby":Te?be:null,title:He&&"string"===typeof J?J:null},te,p.props,{className:(0,l.Z)(te.className,p.props.className),onTouchStart:Ne,ref:ze}),Ae={};k||(We.onTouchStart=function(e){Ne(e),clearTimeout(me.current),clearTimeout(se.current),clearTimeout(fe.current),e.persist(),fe.current=setTimeout((function(){ye()(e)}),B)},We.onTouchEnd=function(e){p.props.onTouchEnd&&p.props.onTouchEnd(e),clearTimeout(fe.current),clearTimeout(me.current),e.persist(),me.current=setTimeout((function(){Me(e)}),V)}),O||(We.onMouseOver=ye(),We.onMouseLeave=De(),H&&(Ae.onMouseOver=ye(!1),Ae.onMouseLeave=De(!1))),L||(We.onFocus=Ce(),We.onBlur=De(),H&&(Ae.onFocus=Ce(!1),Ae.onBlur=De(!1)));var Ie=u.useMemo((function(){return(0,s.Z)({popperOptions:{modifiers:{arrow:{enabled:Boolean(ue),element:ue}}}},G)}),[ue,G]);return u.createElement(u.Fragment,null,u.cloneElement(p,We),u.createElement(q,(0,n.Z)({className:(0,l.Z)(m.popper,H&&m.popperInteractive,a&&m.popperArrow),placement:Y,anchorEl:oe,open:!!oe&&Te,id:We["aria-describedby"],transition:!0},Ae,Ie),(function(e){var t=e.placement,r=e.TransitionProps;return u.createElement(Q,(0,n.Z)({timeout:re.transitions.duration.shorter},r,ee),u.createElement("div",{className:(0,l.Z)(m.tooltip,m["tooltipPlacement".concat((0,f.Z)(t.split("-")[0]))],le.current&&m.touch,a&&m.tooltipArrow)},J,a?u.createElement("span",{className:m.arrow,ref:ce}):null))})))}));t.ZP=(0,m.Z)((function(e){return{popper:{zIndex:e.zIndex.tooltip,pointerEvents:"none"},popperInteractive:{pointerEvents:"auto"},popperArrow:{'&[x-placement*="bottom"] $arrow':{top:0,left:0,marginTop:"-0.71em",marginLeft:4,marginRight:4,"&::before":{transformOrigin:"0 100%"}},'&[x-placement*="top"] $arrow':{bottom:0,left:0,marginBottom:"-0.71em",marginLeft:4,marginRight:4,"&::before":{transformOrigin:"100% 0"}},'&[x-placement*="right"] $arrow':{left:0,marginLeft:"-0.71em",height:"1em",width:"0.71em",marginTop:4,marginBottom:4,"&::before":{transformOrigin:"100% 100%"}},'&[x-placement*="left"] $arrow':{right:0,marginRight:"-0.71em",height:"1em",width:"0.71em",marginTop:4,marginBottom:4,"&::before":{transformOrigin:"0 0"}}},tooltip:{backgroundColor:(0,p.U1)(e.palette.grey[700],.9),borderRadius:e.shape.borderRadius,color:e.palette.common.white,fontFamily:e.typography.fontFamily,padding:"4px 8px",fontSize:e.typography.pxToRem(10),lineHeight:"".concat(E(1.4),"em"),maxWidth:300,wordWrap:"break-word",fontWeight:e.typography.fontWeightMedium},tooltipArrow:{position:"relative",margin:"0"},arrow:{overflow:"hidden",position:"absolute",width:"1em",height:"0.71em",boxSizing:"border-box",color:(0,p.U1)(e.palette.grey[700],.9),"&::before":{content:'""',margin:"auto",display:"block",width:"100%",height:"100%",backgroundColor:"currentColor",transform:"rotate(45deg)"}},touch:{padding:"8px 16px",fontSize:e.typography.pxToRem(14),lineHeight:"".concat(E(16/14),"em"),fontWeight:e.typography.fontWeightRegular},tooltipPlacementLeft:(0,a.Z)({transformOrigin:"right center",margin:"0 24px "},e.breakpoints.up("sm"),{margin:"0 14px"}),tooltipPlacementRight:(0,a.Z)({transformOrigin:"left center",margin:"0 24px"},e.breakpoints.up("sm"),{margin:"0 14px"}),tooltipPlacementTop:(0,a.Z)({transformOrigin:"center bottom",margin:"24px 0"},e.breakpoints.up("sm"),{margin:"14px 0"}),tooltipPlacementBottom:(0,a.Z)({transformOrigin:"center top",margin:"24px 0"},e.breakpoints.up("sm"),{margin:"14px 0"})}}),{name:"MuiTooltip",flip:!1})(L)},28428:function(e,t,r){var n=r(95318),o=r(20862);t.Z=void 0;var i=o(r(67294)),a=(0,n(r(2108)).default)(i.createElement("path",{d:"M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"}),"Delete");t.Z=a}}]);