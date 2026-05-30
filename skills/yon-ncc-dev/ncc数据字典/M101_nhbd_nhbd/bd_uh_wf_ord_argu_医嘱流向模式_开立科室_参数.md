# |<<

**医嘱流向模式_开立科室_参数 (bd_uh_wf_ord_argu / com.yonyou.yh.nhis.bd.wf.vo.WfOrdArguVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1141.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wfargu | 模式策略主键 | pk_wfargu | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_wf | 流向模式编码 | pk_wf | varchar(20) |  | 医嘱流向模式 (NccWFVO) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 6 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 医疗服务类型 (uhsrvtype) |
| 7 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 8 | time_begin | 开始时间 | time_begin | char(8) |  | 时间 (UFTime) |
| 9 | time_end | 结束时间 | time_end | char(8) |  | 时间 (UFTime) |
| 10 | weeknos | 星期数串 | weeknos | varchar(50) |  | 字符串 (String) |
| 11 | pk_usage | 医嘱用法 | pk_usage | varchar(20) |  | 药品用法要求(自定义档案) (Defdoc-030408) |
| 12 | dt_usage | 医嘱用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 13 | ordrecur | 医嘱时间类型 | ordrecur | int |  | 医嘱时间类型 (ordtime) |  | 0=临时医嘱; |