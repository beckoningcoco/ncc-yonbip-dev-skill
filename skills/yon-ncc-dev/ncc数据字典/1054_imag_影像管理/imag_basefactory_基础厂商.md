# |<<

**基础厂商 (imag_basefactory / nc.vo.imag.basefactory.BaseFactoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factory | 厂商pk | pk_factory | varchar(20) | √ | 字符串 (String) |
| 2 | factorycode | 厂商编码 | factorycode | varchar(50) |  | 字符串 (String) |
| 3 | factoryname | 厂商名称 | factoryname | varchar(50) |  | 字符串 (String) |
| 4 | url | 厂商服务地址 | url | varchar(1000) |  | 字符串 (String) |
| 5 | servicetype | 服务类型 | servicetype | varchar(50) |  | 字符串 (String) |
| 6 | connecttype | 连接类型 | connecttype | varchar(10) |  | 字符串 (String) |
| 7 | host | ip | host | varchar(50) |  | 字符串 (String) |
| 8 | port | 端口 | port | varchar(5) |  | 字符串 (String) |
| 9 | timeout | 超时时间毫秒 | timeout | int |  | 整数 (Integer) |
| 10 | clazz | 实现类 | clazz | varchar(1000) |  | 字符串 (String) |
| 11 | factorytype | 厂商当前服务编码类型 | factorytype | varchar(50) |  | 字符串 (String) |
| 12 | enable | 当前厂商是否可用 | enable | varchar(1) |  | 字符串 (String) |
| 13 | isdefault | 是否是此服务类型的默认服务厂商 | isdefault | varchar(1) |  | 字符串 (String) |
| 14 | sysid | 厂商注册在友企联中的id | sysid | varchar(50) |  | 字符串 (String) |
| 15 | extendinfo | 厂商服务扩展信息 | extendinfo | varchar(1000) |  | 字符串 (String) |
| 16 | sign | 数据源唯一标识 | sign | varchar(32) |  | 字符串 (String) |