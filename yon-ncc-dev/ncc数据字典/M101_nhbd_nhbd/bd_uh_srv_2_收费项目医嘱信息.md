# |<<

**收费项目医嘱信息 (bd_uh_srv_2 / nc.vo.srvitem.dataio.UhSrvVO2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1106.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv | 医嘱服务主键 | pk_srv | char(20) | √ | 主键 (UFID) |
| 2 | pk_srvtype | 服务类型填写code | pk_srvtype | varchar(20) | √ | 医疗服务类型 (uhsrvtype) |
| 3 | code_srvtype | 服务类型同上code | code_srvtype | varchar(50) | √ | 字符串 (String) |
| 4 | quan_def | 默认用量 | quan_def | decimal(28, 8) | √ | 数值 (UFDouble) |
| 5 | pk_measdoc_def | 用量单位 | pk_measdoc_def | varchar(20) | √ | 计量单位 (measdoc) |
| 6 | pk_freq | 默认频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 7 | pk_usage | 默认用法 | pk_usage | varchar(20) |  | 医嘱用法 (bdtermusage) |
| 8 | usagenote | 用法要求 | usagenote | varchar(50) |  | 字符串 (String) |
| 9 | note | 医嘱服务备注 | note | varchar(50) |  | 字符串 (String) |
| 10 | expert | 适用症 | expert | varchar(200) |  | 字符串 (String) |
| 11 | work | 作用 | work | varchar(200) |  | 字符串 (String) |
| 12 | flag_use_op | 门诊使用默认Y | flag_use_op | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 13 | flag_use_er | 急诊使用默认Y | flag_use_er | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 14 | flag_use_ip | 住院使用默认Y | flag_use_ip | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 15 | flag_use_pe | 体检使用默认N | flag_use_pe | char(1) |  | 布尔类型 (UFBoolean) | N |
| 16 | flag_use_hm | 家庭使用默认N | flag_use_hm | char(1) |  | 布尔类型 (UFBoolean) | N |
| 17 | flag_ctl_srv | 控制排斥默认N | flag_ctl_srv | char(1) |  | 布尔类型 (UFBoolean) | N |
| 18 | flag_ctl_psn | 控制人员默认N | flag_ctl_psn | char(1) |  | 布尔类型 (UFBoolean) | N |
| 19 | flag_bl | 记费默认Y | flag_bl | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 20 | flag_pd | 物品默认N | flag_pd | char(1) |  | 布尔类型 (UFBoolean) | N |
| 21 | flag_emr | 医疗记录默认N | flag_emr | char(1) |  | 布尔类型 (UFBoolean) | N |
| 22 | flag_nurse | 护理标志默认N | flag_nurse | char(1) |  | 布尔类型 (UFBoolean) | N |