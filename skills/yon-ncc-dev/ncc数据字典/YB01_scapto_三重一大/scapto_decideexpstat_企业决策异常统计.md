# |<<

**企业决策异常统计 (scapto_decideexpstat / nc.vo.scapto.decideexpstat.DecideExpStatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_decideexpstat | 主键 | pk_decideexpstat | char(20) | √ | 主键 (UFID) |
| 2 | company_code | 企业编码 | company_code | varchar(50) |  | 字符串 (String) |
| 3 | company_name | 企业名称 | company_name | varchar(50) |  | 字符串 (String) |
| 4 | imeeting_exp | 会议召开异常数量 | imeeting_exp | int |  | 整数 (Integer) |
| 5 | ipartymeeting_exp | 党委（党组）会未前置异常数量 | ipartymeeting_exp | int |  | 整数 (Integer) |
| 6 | idecideorder_exp | 决策顺序异常数量 | idecideorder_exp | int |  | 整数 (Integer) |
| 7 | itopicvote_exp | 议题表决异常数量 | itopicvote_exp | int |  | 整数 (Integer) |
| 8 | ilegalreview_exp | 法律审核异常数量 | ilegalreview_exp | int |  | 整数 (Integer) |
| 9 | vdef01 | 预留字段01 | vdef01 | varchar(200) |  | 备注 (Memo) |
| 10 | vdef02 | 预留字段02 | vdef02 | varchar(200) |  | 备注 (Memo) |
| 11 | vdef03 | 预留字段03 | vdef03 | varchar(200) |  | 备注 (Memo) |
| 12 | vdef04 | 预留字段04 | vdef04 | varchar(200) |  | 备注 (Memo) |
| 13 | vdef05 | 预留字段05 | vdef05 | varchar(200) |  | 备注 (Memo) |