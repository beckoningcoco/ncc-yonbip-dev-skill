# |<<

**任务默认值 (iufo_taskdefault / nc.vo.iufo.task.TaskDefaultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3519.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskdefault | 任务默认值主键 | pk_taskdefault | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 任务pk | pk_task | char(20) | √ | 任务 (task) |
| 3 | keyword1value | 关键字1的缺省值 | keyword1value | varchar(64) |  | 字符串 (String) |
| 4 | keyword2value | 关键字2的缺省值 | keyword2value | varchar(64) |  | 字符串 (String) |
| 5 | keyword3value | 关键字3的缺省值 | keyword3value | varchar(50) |  | 字符串 (String) |
| 6 | keyword4value | 关键字4的缺省值 | keyword4value | varchar(50) |  | 字符串 (String) |
| 7 | keyword5value | 关键字5的缺省值 | keyword5value | varchar(50) |  | 字符串 (String) |
| 8 | keyword6value | 关键字6的缺省值 | keyword6value | varchar(50) |  | 字符串 (String) |
| 9 | keyword7value | 关键字7的缺省值 | keyword7value | varchar(50) |  | 字符串 (String) |
| 10 | keyword8value | 关键字8的缺省值 | keyword8value | varchar(50) |  | 字符串 (String) |
| 11 | keyword9value | 关键字9的缺省值 | keyword9value | varchar(50) |  | 字符串 (String) |
| 12 | keyword10value | 关键字10的缺省值 | keyword10value | varchar(50) |  | 字符串 (String) |
| 13 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |