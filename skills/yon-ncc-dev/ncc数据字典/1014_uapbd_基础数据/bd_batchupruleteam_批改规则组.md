# |<<

**批改规则组 (bd_batchupruleteam / nc.vo.bd.pub.batchupdaterule.BatchUpdateRuleTeamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchupruleteam | 主键 | pk_batchupruleteam | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | pk_alertregistry | 回写后台任务主键 | pk_alertregistry | varchar(20) |  | 字符串 (String) |
| 5 | code | 规则组编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 规则组名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | memo | 备注 | memo | varchar(1024) |  | 字符串 (String) |
| 8 | isautoexecute | 是否自动执行 | isautoexecute | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 9 | frequencytype | 周期类型 | frequencytype | int |  | 整数 (Integer) |
| 10 | executeday | 执行日 | executeday | int |  | 整数 (Integer) |
| 11 | executetime | 执行时间 | executetime | varchar(8) |  | 时间 (UFTime) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建日期 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 最后修改日期 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |