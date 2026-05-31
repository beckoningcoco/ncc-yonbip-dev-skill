# |<<

**计算机工作站参数 (bd_uh_pc_argu / nc.vo.nhbd.res.uhpc.UhPcArguVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1065.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pcargu | 计算机工作站参数主键 | pk_pcargu | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pc | 计算机工作站 | pk_pc | varchar(20) |  | 计算机工作站定义 (uhpc) |
| 5 | pk_argu | 参数 | pk_argu | varchar(50) |  | 字符串 (String) |
| 6 | code_argu | 参数编码 | code_argu | varchar(256) |  | 字符串 (String) |
| 7 | name_argu | 参数名称 | name_argu | varchar(50) |  | 字符串 (String) |
| 8 | note_argu | 参数说明 | note_argu | varchar(256) |  | 字符串 (String) |
| 9 | arguval | 参数值 | arguval | varchar(256) |  | 字符串 (String) |
| 10 | flag_stop | 停用标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |