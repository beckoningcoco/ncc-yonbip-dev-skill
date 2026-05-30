# |<<

**就诊类型登记下服务项目 (bd_uh_pvtype_srv / com.yonyou.yh.nhis.bd.pvtypesrv.vo.PVTypeSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1094.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvtypesrv | 就诊类型下服务主键 | pk_pvtypesrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | pk_item | 服务 | pk_item | varchar(50) |  | 字符串 (String) |
| 6 | flag_sel | 可选标志 | flag_sel | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |