# |<<

**医保日志 (uh_pubhp_log / nc.vo.nhhp.log.UhPubHpLog)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6209.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pubhp_log | 主键 | pk_pubhp_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_hp | 医保计划 | pk_hp | varchar(50) |  | 字符串 (String) |
| 3 | trade_type | 交易类型 | trade_type | varchar(50) |  | 字符串 (String) |
| 4 | trade_intoparam | 交易入参 | trade_intoparam | varchar(500) |  | 字符串 (String) |
| 5 | trade_exitparam | 交易出参 | trade_exitparam | varchar(500) |  | 字符串 (String) |
| 6 | trade_time | 交易时间 | trade_time | char(19) |  | 日期 (UFDate) |
| 7 | call_result | 调用结果 | call_result | varchar(50) |  | 字符串 (String) |
| 8 | return_information | 返回信息 | return_information | varchar(50) |  | 字符串 (String) |