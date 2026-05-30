# |<<

**门诊病历模板分类 (bd_opmr_tempcate / com.yonyou.yh.nhis.bd.opmr.vo.OpEmrTempcateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/919.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tempcate | 病历模板分类主键 | pk_tempcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 分类编码 | code | varchar(20) |  | 字符串 (String) |
| 5 | name | 分类名称 | name | varchar(20) |  | 字符串 (String) |
| 6 | pk_father | 上级分类 | pk_father | varchar(20) |  | 字符串 (String) |
| 7 | pk_dept | 使用机构 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_psn | 使用人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | eu_emrtempright | 使用范围 | eu_emrtempright | int |  | 门诊病例模板分类_使用范围 (OpMrEnum) |  | 0=全院; |