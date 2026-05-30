# |<<

**医疗服务类型 (bd_uh_srvtype / com.yonyou.nhis.bd.pub2.srvtype.vo.SrvTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtype | 服务类型主键 | pk_srvtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | code | 服务类型编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 服务类型名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_father | 上级类型 | pk_father | char(20) |  | 主键 (UFID) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | flag_pd | 物品标志 | flag_pd | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | flag_bl | 记费标志 | flag_bl | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | flag_nurse | 护理使用标志 | flag_nurse | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | flag_sys | 系统标识 | flag_sys | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_srvordfrom | 服务医疗单 | pk_srvordfrom | char(20) |  | 主键 (UFID) |
| 13 | pk_srvordases | 服务开立评估 | pk_srvordases | char(20) |  | 主键 (UFID) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |