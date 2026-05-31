# |<<

**班组 (ewm_team / nc.vo.am.team.TeamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1953.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_team | 班组主键 | pk_team | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | team_code | 编码 | team_code | varchar(40) |  | 字符串 (String) |
| 5 | team_name | 名称 | team_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | pk_leader | 班组长 | pk_leader | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |