# |<<

**医嘱处置医嘱展示元数据 (nhcn_OpcdCNOrder / com.yonyou.yh.nhis.cn.ord.vo.OpcdCNOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3822.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ord | 医嘱主键 | pk_ord | char(20) | √ | 主键 (UFID) |
| 2 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 3 | code_ord | 医嘱编码 | code_ord | varchar(50) |  | 字符串 (String) |
| 4 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 5 | desc_ord | 医嘱内容 | desc_ord | varchar(50) |  | 字符串 (String) |
| 6 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 7 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 8 | eu_status_ord | 医嘱状态 | eu_status_ord | varchar(50) |  | 字符串 (String) |
| 9 | pk_usage | 用法主键 | pk_usage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 10 | dt_usage | 用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 11 | name_usage | 用法名称 | name_usage | varchar(50) |  | 字符串 (String) |
| 12 | pk_freq | 频次主键 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 13 | name_freq | 频次名称 | name_freq | varchar(50) |  | 字符串 (String) |
| 14 | days_ord | 医嘱天数 | days_ord | varchar(50) |  | 字符串 (String) |
| 15 | pk_dept_ordsrv | 执行科室 | pk_dept_ordsrv | varchar(20) |  | 组织_部门 (dept) |
| 16 | figure | 总金额 | figure | varchar(50) |  | 字符串 (String) |
| 17 | eu_recur | 医嘱类型 | eu_recur | varchar(50) |  | 字符串 (String) |