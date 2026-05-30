# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_shift | pk_shift | pk_shift | char(20) | √ |
| 2 | allowearly | allowearly | allowearly | number(16, 4) |  |  | 0 |
| 3 | allowlate | allowlate | allowlate | number(16, 4) |  |  | 0 |
| 4 | beginday | beginday | beginday | number(38, 0) |  |  | 0 |
| 5 | begintime | begintime | begintime | char(8) |
| 6 | capbeginday | capbeginday | capbeginday | number(38, 0) |
| 7 | capbegintime | capbegintime | capbegintime | char(8) |
| 8 | capendday | capendday | capendday | number(38, 0) |
| 9 | capendtime | capendtime | capendtime | char(8) |
| 10 | capgzsj | capgzsj | capgzsj | number(16, 4) |
| 11 | cardtype | cardtype | cardtype | number(38, 0) |
| 12 | code | code | code | varchar2(80) | √ |
| 13 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 14 | defaultflag | defaultflag | defaultflag | char(1) |
| 15 | earliestendday | earliestendday | earliestendday | number(38, 0) |
| 16 | earliestendtime | earliestendtime | earliestendtime | char(8) |
| 17 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 18 | endday | endday | endday | number(38, 0) |
| 19 | endtime | endtime | endtime | char(8) |
| 20 | gzsj | gzsj | gzsj | number(16, 4) |  |  | 0 |
| 21 | includenightshift | includenightshift | includenightshift | char(1) |  |  | 'N' |
| 22 | isallowout | isallowout | isallowout | char(1) | √ |  | 'Y' |
| 23 | isautokg | isautokg | isautokg | char(1) |  |  | 'Y' |
| 24 | iscapedited | iscapedited | iscapedited | char(1) |
| 25 | isflexiblefinal | isflexiblefinal | isflexiblefinal | char(1) |  |  | 'N' |
| 26 | ishredited | ishredited | ishredited | char(1) |
| 27 | isotflexible | isotflexible | isotflexible | char(1) | √ |  | 'N' |
| 28 | isotflexiblefinal | isotflexiblefinal | isotflexiblefinal | char(1) |  |  | 'N' |
| 29 | isrttimeflexible | isrttimeflexible | isrttimeflexible | char(1) |  |  | 'N' |
| 30 | isrttimeflexiblefinal | isrttimeflexiblefinal | isrttimeflexiblefinal | char(1) |  |  | 'N' |
| 31 | issinglecard | issinglecard | issinglecard | char(1) |
| 32 | isturn | isturn | isturn | char(1) |
| 33 | kghours | kghours | kghours | number(16, 4) |  |  | 0 |
| 34 | largeearly | largeearly | largeearly | number(16, 4) |  |  | 0 |
| 35 | largelate | largelate | largelate | number(16, 4) |  |  | 0 |
| 36 | latestbeginday | latestbeginday | latestbeginday | number(38, 0) |  |  | 0 |
| 37 | latestbegintime | latestbegintime | latestbegintime | char(8) |
| 38 | memo | memo | memo | varchar2(100) |
| 39 | name | name | name | varchar2(300) | √ |
| 40 | name2 | name2 | name2 | varchar2(300) |
| 41 | name3 | name3 | name3 | varchar2(300) |
| 42 | name4 | name4 | name4 | varchar2(300) |
| 43 | name5 | name5 | name5 | varchar2(300) |
| 44 | name6 | name6 | name6 | varchar2(300) |
| 45 | nightbeginday | nightbeginday | nightbeginday | number(38, 0) |  |  | 0 |
| 46 | nightbegintime | nightbegintime | nightbegintime | char(8) |
| 47 | nightendday | nightendday | nightendday | number(38, 0) |  |  | 0 |
| 48 | nightendtime | nightendtime | nightendtime | char(8) |
| 49 | nightgzsj | nightgzsj | nightgzsj | number(16, 4) |  |  | 0 |
| 50 | ontmbeyond | ontmbeyond | ontmbeyond | number(16, 4) |
| 51 | ontmend | ontmend | ontmend | number(16, 4) |
| 52 | overtmbegin | overtmbegin | overtmbegin | number(16, 4) |
| 53 | overtmbeyond | overtmbeyond | overtmbeyond | number(16, 4) |
| 54 | pk_group | pk_group | pk_group | char(20) | √ |
| 55 | pk_org | pk_org | pk_org | char(20) | √ |
| 56 | pk_shifttype | pk_shifttype | pk_shifttype | char(20) |
| 57 | timebeginday | timebeginday | timebeginday | number(38, 0) | √ |  | 0 |
| 58 | timebegintime | timebegintime | timebegintime | char(8) | √ |
| 59 | timeendday | timeendday | timeendday | number(38, 0) | √ |  | 0 |
| 60 | timeendtime | timeendtime | timeendtime | char(8) | √ |
| 61 | useontmrule | useontmrule | useontmrule | char(1) |
| 62 | useovertmrule | useovertmrule | useovertmrule | char(1) |
| 63 | worklen | worklen | worklen | number(38, 0) |
| 64 | creationtime | creationtime | creationtime | char(19) | √ |
| 65 | creator | creator | creator | char(20) | √ |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 68 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 69 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |