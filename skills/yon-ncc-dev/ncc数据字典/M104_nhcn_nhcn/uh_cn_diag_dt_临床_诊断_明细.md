# |<<

**临床_诊断_明细 (uh_cn_diag_dt / com.yonyou.yh.nhis.cn.diag.vo.CNDiagDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5991.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cndiagdt | 临床诊断明细主键 | pk_cndiagdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cndiag | 对应临床诊断 | pk_cndiag | varchar(20) |  | 字符串 (String) |
| 5 | sortno | 排序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_diag | 标准诊断 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 7 | desc_diag | 诊断描述 | desc_diag | varchar(256) |  | 字符串 (String) |
| 8 | flag_maj | 主要诊断标志 | flag_maj | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | flag_susp | 疑似诊断标志 | flag_susp | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | flag_infect | 传染病标志 | flag_infect | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | note | 备注 | note | varchar(256) |  | 字符串 (String) |