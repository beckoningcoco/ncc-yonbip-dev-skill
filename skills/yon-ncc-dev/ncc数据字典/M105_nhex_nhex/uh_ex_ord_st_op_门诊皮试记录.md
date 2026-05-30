# |<<

**门诊皮试记录 (uh_ex_ord_st_op / com.yonyou.yh.nhis.ex.mt.vo.ExMtOrdOcStVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6106.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_st_oc | 主键 | pk_st_oc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_strec | 皮试记录 | pk_strec | char(20) |  | 主键 (UFID) |
| 5 | date_begin_st | 皮试开始时间 | date_begin_st | char(19) |  | 日期时间 (UFDateTime) |
| 6 | duration | 观察时间 | duration | int |  | 整数 (Integer) |
| 7 | eu_method | 皮试方法 | eu_method | int |  | 皮试方法 (enum) |  | 1=皮内实验; |