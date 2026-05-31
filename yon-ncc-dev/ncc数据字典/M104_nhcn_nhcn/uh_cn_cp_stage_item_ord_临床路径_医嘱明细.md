# |<<

**临床路径_医嘱明细 (uh_cn_cp_stage_item_ord / com.yonyou.yh.nhis.cn.cp.vo.CNCpStageItemOrdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5985.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ord | 主键 | pk_ord | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_item | 项目表中的项目id | pk_item | char(20) | √ | 主键 (UFID) |
| 5 | cate_ord | 医嘱类别 | cate_ord | varchar(20) | √ | 主键 (UFID) |
| 6 | sortno | 医嘱序号 | sortno | int |  | 整数 (Integer) |
| 7 | code_ord | 遗嘱编码 | code_ord | varchar(20) |  | 字符串 (String) |
| 8 | name_ord | 医嘱名称 | name_ord | varchar(256) |  | 字符串 (String) |
| 9 | desc_ord | 医嘱内容 | desc_ord | varchar(4000) |  | 字符串 (String) |
| 10 | groupmark | 药品组标记 | groupmark | int |  | 整数 (Integer) |
| 11 | ord_group_no | 组排序号 | ord_group_no | int |  | 整数 (Integer) |
| 12 | drug_int | 药品排序号 | drug_int | int |  | 整数 (Integer) |
| 13 | norms | 规格 | norms | varchar(32) |  | 字符串 (String) |
| 14 | dt_fac | 生产厂家 | dt_fac | varchar(80) |  | 字符串 (String) |
| 15 | dt_usage | 遗嘱用法(用量) | dt_usage | varchar(32) |  | 字符串 (String) |
| 16 | dt_usagenote | 用法要求(用法) | dt_usagenote | varchar(20) |  | 字符串 (String) |
| 17 | dose_units | 剂量单位 | dose_units | varchar(32) |  | 字符串 (String) |
| 18 | drip_speed | 滴速 | drip_speed | int |  | 整数 (Integer) |
| 19 | pk_freq | 频次 | pk_freq | varchar(32) |  | 字符串 (String) |
| 20 | pk_org_exec | 医疗服务对应的执行机构 | pk_org_exec | varchar(20) |  | 字符串 (String) |
| 21 | pk_dept_exec | 医疗服务对应的执行科室 | pk_dept_exec | varchar(20) |  | 字符串 (String) |
| 22 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 23 | code_srvtype | 分类编码 | code_srvtype | varchar(50) |  | 字符串 (String) |
| 24 | type_ord | 医嘱类型 | type_ord | varchar(50) |  | 字符串 (String) |
| 25 | pk_ord_dit | 医嘱服务项目主键 | pk_ord_dit | varchar(50) |  | 字符串 (String) |