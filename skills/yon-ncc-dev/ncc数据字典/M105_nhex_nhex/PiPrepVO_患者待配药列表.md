# |<<

**患者待配药列表 (PiPrepVO / com.yonyou.yh.nhis.pd.opdrugprep.vo.PiPrepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpd | 处方请领主键 | pk_ordpd | char(20) | √ | 主键 (UFID) |
| 2 | sortno | 队列号 | sortno | int |  | 整数 (Integer) |
| 3 | pk_pati | 患者主键 | pk_pati | char(20) |  | 字符串 (String) |
| 4 | pk_pvque | 队列主键 | pk_pvque | char(20) |  | 字符串 (String) |
| 5 | paticode | 患者编码 | paticode | varchar(50) |  | 字符串 (String) |
| 6 | patiinfo | 患者信息 | patiinfo | varchar(50) |  | 字符串 (String) |
| 7 | checked | 选中 | checked | char(1) |  | 布尔类型 (UFBoolean) |