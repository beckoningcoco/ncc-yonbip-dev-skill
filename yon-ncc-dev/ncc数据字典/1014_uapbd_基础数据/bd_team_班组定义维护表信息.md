# |<<

**班组定义维护表信息 (bd_team / nc.vo.bd.team.team01.entity.TeamHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/997.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cteamid | 班组 | cteamid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) | √ | 组织_版本信息 (org_v) |
| 5 | bshiftflag | 轮班 | bshiftflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | vteamcode | 班组编码 | vteamcode | varchar(40) |  | 字符串 (String) |
| 7 | vteamname | 班组名称 | vteamname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 9 | cdeptid | 部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 10 | cdeptvid | 部门编码 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | cresponsibler | 负责人 | cresponsibler | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enum) | 2 | 2=已启用; |