# |<<

**入院通知单服务申请 (uh_pv_ip_notice_srv / com.yonyou.yh.nhis.pv.pvipnotice.vo.PVIpNoticeSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6239.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvipnoticesrv | 入院通知单服务申请主键 | pk_pvipnoticesrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 5 | pk_freq | 医嘱频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 6 | pk_useage | 用法 | pk_useage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 7 | pk_usegenote | 用法要求 | pk_usegenote | varchar(20) |  | 药品用法要求(自定义档案) (Defdoc-030408) |
| 8 | dt_useage | 用法编码 | dt_useage | varchar(50) |  | 字符串 (String) |
| 9 | dt_usegenote | 用法要求编码 | dt_usegenote | varchar(50) |  | 字符串 (String) |
| 10 | quan | 单次量 | quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 11 | pk_pvipnotice | 入院通知单主键 | pk_pvipnotice | varchar(20) |  | 字符串 (String) |