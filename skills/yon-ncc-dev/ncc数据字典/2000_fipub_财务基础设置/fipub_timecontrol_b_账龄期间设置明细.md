# |<<

**账龄期间设置明细 (fipub_timecontrol_b / nc.vo.fipub.timecontrol.TimeCtrlDetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2275.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timectrl_b | 主键 | pk_timectrl_b | char(20) | √ | 主键 (UFID) |
| 2 | propertyid | 序号 | propertyid | int |  | 整数 (Integer) |
| 3 | descr | 账期描述 | descr | varchar(200) |  | 字符串 (String) |
| 4 | startunit | 账期开始 | startunit | int |  | 整数 (Integer) |
| 5 | endunit | 账期结束 | endunit | int |  | 整数 (Integer) |
| 6 | sumunit | 账期总数 | sumunit | int |  | 整数 (Integer) |