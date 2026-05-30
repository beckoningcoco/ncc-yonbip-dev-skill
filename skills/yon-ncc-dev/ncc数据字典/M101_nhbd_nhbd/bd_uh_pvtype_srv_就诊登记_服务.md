# |<<

**就诊登记_服务 (bd_uh_pvtype_srv / com.yonyou.yh.nhis.bd.uhsrvpvtype.vo.UhSrvPvtypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1095.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvtypesrv | 就诊登记服务主键 | pk_pvtypesrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 主键 (UFID) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(50) |  | 字符串 (String) |
| 5 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(20) |  | 主键 (UFID) |
| 6 | pk_item | 对应收费项目 | pk_item | varchar(20) |  | 主键 (UFID) |
| 7 | flag_edit | 可选标志 | flag_edit | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |