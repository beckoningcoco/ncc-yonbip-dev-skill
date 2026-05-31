# |<<

**验收检查项 (pm_check_item / nc.vo.ppm.projectcheck.CheckItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4417.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_check_item | 检查项主键 | pk_check_item | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 序号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | check_code | 检查项编码 | check_code | varchar(50) |  | 字符串 (String) |
| 4 | check_name | 检查项名称 | check_name | varchar(200) |  | 字符串 (String) |
| 5 | check_details | 检查项描述 | check_details | varchar(500) |  | 字符串 (String) |
| 6 | pic_flag | 是否拍照 | pic_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | measure_flag | 是否测量 | measure_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pmccheckresult | 检查结果 | pmccheckresult | varchar(50) |  | 字符串 (String) |
| 9 | measureddata | 测量数据（10个） | measureddata | varchar(200) |  | 字符串 (String) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | delete_flag | 删除标志位 | delete_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | check_flag | 检查 | check_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | check_requ | 检查要求 | check_requ | varchar(200) |  | 字符串 (String) |
| 14 | check_result | nc检查结果 | check_result | int |  | 检查结果 (AcceptCheckResultEnum) |  | 1=合格; |