# |<<

**医技资源设备 (bd_uh_msp / nc.vo.nhbd.res.MedSrvPVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1058.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msp | 资源主键 | pk_msp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 资源编码 | code | varchar(30) | √ | 字符串 (String) |
| 5 | name | 资源名称 | name | varchar(50) | √ | 多语文本 (MultiLangText) |
| 6 | pk_msptype | 资源类型主键 | pk_msptype | varchar(20) | √ | 医技资源类型(自定义档案) (Defdoc-010600) |
| 7 | dt_msptype | 资源类型编码 | dt_msptype | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept | 所属科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 10 | flag_stop | 停用标志 | flag_stop | char(1) | √ | 布尔类型 (UFBoolean) |
| 11 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |
| 12 | pk_org_v | 所属机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 13 | code_fa | 当前对应的主设备编码 | code_fa | varchar(50) |  | 字符串 (String) |
| 14 | pk_place | 医技资源地点 | pk_place | varchar(20) |  | 位置管理 (uhplace) |
| 15 | name_place | 地址 | name_place | varchar(50) |  | 字符串 (String) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |