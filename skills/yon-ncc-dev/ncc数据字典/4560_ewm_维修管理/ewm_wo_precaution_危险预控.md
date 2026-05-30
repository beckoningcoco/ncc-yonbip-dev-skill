# |<<

**危险预控 (ewm_wo_precaution / nc.vo.ewm.workorder.WOPrecautionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_precaution | 危险预控主键 | pk_wo_precaution | char(20) | √ | 主键 (UFID) |
| 2 | pk_precaution | 危险编码 | pk_precaution | varchar(20) |  | 危险与安全措施 (PrecautionVO) |
| 3 | risk_zone | 危险点 | risk_zone | varchar(50) |  | 字符串 (String) |
| 4 | precaution_content | 预防措施 | precaution_content | varchar(1024) |  | 字符串 (String) |
| 5 | isolate_flag | 需要隔离 | isolate_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_isolate_temp | 隔离模板 | pk_isolate_temp | varchar(20) |  | 隔离模板 (IsoTempHeadVO) |
| 7 | pk_isolation | 隔离单 | pk_isolation | varchar(20) |  | 隔离单 (IsolationHeadVO) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |