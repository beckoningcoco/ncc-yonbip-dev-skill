# |<<

**合并监控步骤 (iufo_hbstep / nc.vo.hbbb.hbflow.HBStepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3454.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbstep | 主键 | pk_hbstep | char(20) | √ | 主键 (UFID) |
| 2 | funnode | 功能节点 | funnode | varchar(50) |  | 字符串 (String) |
| 3 | pk_hbflow | 对应合并流 | pk_hbflow | varchar(20) |  | 合并监控流 (hbflowdef) |
| 4 | iorder | 显示顺序 | iorder | int |  | 整数 (Integer) |
| 5 | name | 步骤名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | autolock | 步骤自动加锁 | autolock | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | checksuborg | 是否受下级影响 | checksuborg | char(1) | √ | 布尔类型 (UFBoolean) |