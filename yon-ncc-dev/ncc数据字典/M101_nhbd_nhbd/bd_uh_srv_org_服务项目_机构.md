# |<<

**服务项目_机构 (bd_uh_srv_org / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1119.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvorg | 机构服务主键 | pk_srvorg | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_srv | 服务 | pk_srv | varchar(20) |  | 医疗服务字典 (uhsrv) |
| 5 | mnecode | 拼音码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_freq | 默认频次 | pk_freq | char(20) |  | 主键 (UFID) |
| 7 | pk_usage | 默认用法 | pk_usage | char(20) |  | 主键 (UFID) |
| 8 | usagenote | 默认用法要求 | usagenote | varchar(50) |  | 字符串 (String) |
| 9 | quan_def | 默认用量 | quan_def | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | pk_measdoc_def | 用量单位 | pk_measdoc_def | char(20) |  | 主键 (UFID) |
| 11 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | dt_usage | 默认用法new | dt_usage | varchar(50) |  | 字符串 (String) |
| 13 | dt_usagenote | 默认用法要求new | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 14 | angcode | angcode | angcode | varchar(50) |  | 字符串 (String) |
| 15 | othcode | 其他码 | othcode | varchar(50) |  | 字符串 (String) |
| 16 | pk_price | 定价模式 | pk_price | varchar(50) |  | 字符串 (String) |
| 17 | pk_usagenote | 用法要求主键 | pk_usagenote | varchar(50) |  | 字符串 (String) |
| 18 | price | 价格 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | wbcode | 五笔码 | wbcode | varchar(50) |  | 字符串 (String) |
| 20 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 21 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |