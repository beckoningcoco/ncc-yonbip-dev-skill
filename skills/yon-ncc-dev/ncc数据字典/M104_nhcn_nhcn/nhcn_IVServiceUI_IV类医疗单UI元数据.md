# |<<

**IV类医疗单UI元数据 (nhcn_IVServiceUI / com.yonyou.yh.nhis.cn.ord.vo.IVServiceUIVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivsrv | 主键 | pk_ivsrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 3 | pk_pd | 物品 | pk_pd | varchar(50) |  | 字符串 (String) |
| 4 | spec_pd | 物品规格 | spec_pd | varchar(50) |  | 字符串 (String) |
| 5 | quan_cur | 用量 | quan_cur | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | pk_measdoc | 医疗单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 7 | pk_measdoc_base | 包装单位 | pk_measdoc_base | varchar(20) |  | 计量单位 (measdoc) |
| 8 | name_srv | 服务名称 | name_srv | varchar(50) |  | 字符串 (String) |
| 9 | name_pd | 物品名称 | name_pd | varchar(50) |  | 字符串 (String) |
| 10 | name_measdoc_med | 医疗单位名称 | name_measdoc_med | varchar(50) |  | 字符串 (String) |
| 11 | name_freq | 频次名称 | name_freq | varchar(50) |  | 字符串 (String) |
| 12 | pk_freq | 频次主键 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 13 | name_usage | 用法名称 | name_usage | varchar(50) |  | 字符串 (String) |
| 14 | name_measdoc_salse | 取药量单位 | name_measdoc_salse | varchar(50) |  | 字符串 (String) |
| 15 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 16 | dt_srvtype | 服务类型 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 17 | pk_freq_def | 默认频次 | pk_freq_def | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 18 | isdefault | 默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | eu_abrd | 进口分类 | eu_abrd | varchar(50) |  | 字符串 (String) |
| 20 | name_fac | 厂商名称 | name_fac | varchar(50) |  | 字符串 (String) |
| 21 | pk_fac | 厂商主键 | pk_fac | varchar(50) |  | 字符串 (String) |
| 22 | price | 价格 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | pk_usage | 用法主键 | pk_usage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 24 | name_usegenote | 用法要求名称 | name_usegenote | varchar(50) |  | 字符串 (String) |
| 25 | pk_usegenote | 用法要求 | pk_usegenote | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 26 | pk_srvtype | 服务类型主键 | pk_srvtype | varchar(50) |  | 字符串 (String) |
| 27 | flag_srvset | 服务套标志 | flag_srvset | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | quan | 取药量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | flag_pd | 物品标志 | flag_pd | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | eu_settype | 套类型 | eu_settype | int |  | 整数 (Integer) |
| 31 | code_srv | 服务编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 32 | factor_cb | 当前包装与基本包装单位换算系数 | factor_cb | varchar(50) |  | 字符串 (String) |
| 33 | factor_mb | 医疗单位与基本单位换算系数 | factor_mb | varchar(50) |  | 字符串 (String) |
| 34 | pk_measdoc_sale | 零售单位 | pk_measdoc_sale | varchar(20) |  | 计量单位 (measdoc) |
| 35 | pk_ordsrv | 医嘱服务主键 | pk_ordsrv | varchar(50) |  | 字符串 (String) |
| 36 | pk_ordsrvpd | 医嘱服务物品关系主键 | pk_ordsrvpd | varchar(50) |  | 字符串 (String) |
| 37 | dt_usegenote | 用法要求编码 | dt_usegenote | varchar(50) |  | 字符串 (String) |
| 38 | dt_usage | 用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 39 | flag_pati | 是否自备 | flag_pati | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | dt_frequnit | 频次周期单位 | dt_frequnit | varchar(50) |  | 字符串 (String) |
| 41 | freqct | 频次周期下次数 | freqct | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | name_qu_measdoc | 门诊单位名称 | name_qu_measdoc | varchar(50) |  | 字符串 (String) |
| 43 | pk_measdoc_qu | 辅计量单位 | pk_measdoc_qu | varchar(50) |  | 字符串 (String) |
| 44 | measrate | 换算系数公式_主计量单位/辅计量单位 | measrate | varchar(50) |  | 字符串 (String) |
| 45 | drip_speed | 滴速 | drip_speed | int |  | 整数 (Integer) |
| 46 | date_num | 天数 | date_num | int |  | 整数 (Integer) |
| 47 | hpnote | 医保说明 | hpnote | varchar(256) |  | 字符串 (String) |