# |<<

**质控明细 (cn_emr_qa_detail / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrQaDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1595.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnemrqadetail | 明细主键 | pk_cnemrqadetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cnemrqa | 质控 | pk_cnemrqa | varchar(20) |  | 质控主表 (cNEmrQaVO) |
| 5 | pk_bdemrqaitem | 质控项 | pk_bdemrqaitem | varchar(20) |  | 质控项目 (EmrQaItemVO) |
| 6 | eu_mark_level | 当前级别 | eu_mark_level | int |  | 判定级别 (EmrQaLevelVO) |  | 0=甲级; |