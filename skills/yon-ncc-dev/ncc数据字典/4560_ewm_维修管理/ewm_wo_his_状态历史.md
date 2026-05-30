# |<<

**状态历史 (ewm_wo_his / nc.vo.ewm.workorder.WOHisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1963.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_his | 主键 | pk_wo_his | char(20) | √ | 主键 (UFID) |
| 2 | pk_changer | 变更人 | pk_changer | varchar(20) |  | 用户 (user) |
| 3 | systime | 变更日期 | systime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | pk_wostatus | 变更状态 | pk_wostatus | varchar(20) |  | 工单状态 (wostatus) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 8 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |