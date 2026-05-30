# |<<

**票据管理_登记作废 (uh_bl_inv_reg_op / com.yonyou.yh.nhis.bl.invc.vo.InvcResOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5938.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invregop | 票据登记操作 | pk_invregop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | eu_regoptype | 操作业务类型 | eu_regoptype | int |  | 票据分发业务类型 (invcissdttype) |  | 0=票据退货; |