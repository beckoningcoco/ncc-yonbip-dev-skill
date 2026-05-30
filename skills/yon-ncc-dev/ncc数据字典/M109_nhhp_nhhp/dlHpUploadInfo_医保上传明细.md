# |<<

**医保上传明细 (dlHpUploadInfo / com.yonyou.yh.nhis.hp.dalian.vo.DlHpUploadInfo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1705.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 医保上传明细主键 | pk_log | char(20) | √ | 主键 (UFID) |
| 2 | pv_flag | 就诊主键 | pv_flag | varchar(50) |  | 字符串 (String) |
| 3 | cg_flag | 医嘱或记费主键 | cg_flag | varchar(50) |  | 字符串 (String) |
| 4 | content | 传输内容 | content | varchar(50) |  | 字符串 (String) |
| 5 | transflag | 传输标识 | transflag | varchar(50) |  | 字符串 (String) |
| 6 | transtime | 传输时间 | transtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | hp_flag | 医保上传标识 | hp_flag | varchar(50) |  | 字符串 (String) |
| 8 | retcode | 返回值代码 | retcode | varchar(50) |  | 字符串 (String) |
| 9 | receive | 接收内容 | receive | varchar(50) |  | 字符串 (String) |
| 10 | flag_ord | 医嘱明细标识 | flag_ord | char(1) |  | 布尔类型 (UFBoolean) |