# |<<

**门诊就诊队列 (uh_pv_que / com.yonyou.yh.nhis.pv.pvque.op.vo.UhPVQueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6245.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvque | 就诊排队主键 | pk_pvque | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 6 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (pvbanner) |
| 7 | sortno | 排序号 | sortno | int |  | 整数 (Integer) |
| 8 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 字符串 (String) |
| 9 | ticketno | 票号 | ticketno | int |  | 整数 (Integer) |
| 10 | pk_que | 队列 | pk_que | varchar(50) |  | 字符串 (String) |
| 11 | eu_status | 队列状态 | eu_status | varchar(50) |  | 队列状态 (EnumStatus) |  | 0=加入队列; |