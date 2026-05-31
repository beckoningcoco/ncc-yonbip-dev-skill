# |<<

**工单日志 (ewm_wo_log / nc.vo.ewm.workorder.WOLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1964.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_log | 工单日志主键 | pk_wo_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_recorder | 记录人 | pk_recorder | varchar(20) |  | 用户 (user) |
| 3 | content | 内容 | content | varchar(200) |  | 字符串 (String) |
| 4 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 6 | rec_time | 记录日期 | rec_time | char(19) |  | 日期 (UFDate) |
| 7 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 8 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |