# |<<

**检查项 (pm_checkreq / nc.vo.pmbd.checkrequest.CheckReqVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkreq | 检查项主键 | pk_checkreq | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_acceptcheck | 检查项编码 | pk_acceptcheck | varchar(20) |  | 检查项 (acceptcheckvo) |
| 4 | essent | 重要性 | essent | int |  | 重要性 (essentenum) |  | 1=重要; |