# |<<

**票据管理_核消_领用明细 (un_bl_inv_wf_iss / com.yonyou.yh.nhis.bl.invc.vo.BlInvcWriteoffIssVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6306.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invwriteoffiss | 票据核消领用主键 | pk_invwriteoffiss | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_invisspk | 对应的票据领用明细 | pk_invisspk | varchar(20) |  | 票据管理_领用_票据包 (blinvcisspk) |
| 5 | invno_begin | 核消票据开始号 | invno_begin | varchar(50) |  | 字符串 (String) |
| 6 | invno_end | 核消票据结束号 | invno_end | varchar(50) |  | 字符串 (String) |
| 7 | invnos_canc | 作废发票号码串 | invnos_canc | varchar(4000) |  | 字符串 (String) |
| 8 | eu_invwriteoff | 核消结论 | eu_invwriteoff | int |  | 核销结论 (invcwriteoffrst) |  | 0=通过; |