# |<<

**队列管理台维护 (bd_uh_ques / nc.vo.nhbd.wf.UhBDQuesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1102.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvques | 就诊队列管理台主键 | pk_pvques | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 队列管理台编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 队列管理台名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | pk_quetype | 管理的队列类型 | pk_quetype | varchar(20) |  | 队列类型(自定义档案) (Defdoc-020007) |
| 7 | addr_board | 默认屏幕地址 | addr_board | varchar(256) |  | 字符串 (String) |
| 8 | enablestate | 启用标志 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | dt_quetype | 管理的队列类型编码 | dt_quetype | varchar(50) |  | 字符串 (String) |
| 10 | pk_pvquerule | 默认队列分诊规则 | pk_pvquerule | varchar(20) |  | 就诊队列_分诊规则 (uhbdquerule) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |