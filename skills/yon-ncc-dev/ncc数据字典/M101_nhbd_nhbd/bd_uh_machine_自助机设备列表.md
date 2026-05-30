# |<<

**自助机设备列表 (bd_uh_machine / nc.vo.nhbd.bduhmachine.BdUhMachineVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1056.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_machine | 自助机主键 | pk_machine | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 资源编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 资源名称 | name | varchar(200) |  | 字符串 (String) |
| 6 | name2 | name2 | name2 | varchar(200) |  | 字符串 (String) |
| 7 | name3 | name3 | name3 | varchar(200) |  | 字符串 (String) |
| 8 | name4 | name4 | name4 | varchar(200) |  | 字符串 (String) |
| 9 | name5 | name5 | name5 | varchar(200) |  | 字符串 (String) |
| 10 | name6 | name6 | name6 | varchar(200) |  | 字符串 (String) |
| 11 | mnecode | 输入码 | mnecode | varchar(200) |  | 字符串 (String) |
| 12 | note | 地址 | note | varchar(200) |  | 字符串 (String) |
| 13 | pk_dept | 科室 | pk_dept | varchar(20) |  | 字符串 (String) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |