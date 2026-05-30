# |<<

**传输资源属性 (adp_resprop / nc.vo.uap.distribution.restype.ResPropertiesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/21.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | propid | 属性ID | propid | char(20) | √ | 主键 (UFID) |
| 2 | resid | 资源类型ID | resid | varchar(20) |  | 传输资源注册信息 (resourcetyperegister) |
| 3 | rescode | 资源类型编码 | rescode | varchar(50) |  | 字符串 (String) |
| 4 | propkey | 键 | propkey | varchar(50) |  | 字符串 (String) |
| 5 | propname | 名称 | propname | varchar(50) |  | 字符串 (String) |
| 6 | propenable | 是否有效 | propenable | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | defenable | 是否有效的默认值 | defenable | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | propvalue | 值 | propvalue | varchar(50) |  | 字符串 (String) |
| 9 | updatetime | 更新时间 | updatetime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | updateuser | 更新操作的用户编号 | updateuser | varchar(50) |  | 字符串 (String) |
| 11 | propdesc | 说明 | propdesc | varchar(200) |  | 字符串 (String) |