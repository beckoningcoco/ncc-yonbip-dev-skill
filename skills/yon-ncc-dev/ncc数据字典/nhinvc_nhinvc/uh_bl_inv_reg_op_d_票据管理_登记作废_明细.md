# |<<

**票据管理_登记作废_明细 (uh_bl_inv_reg_op_d / com.yonyou.yh.nhis.bl.invc.vo.InvcResOpDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5939.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invopd | 票据登记操作明细 | pk_invopd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_invregpk | 票据登记票据包 | pk_invregpk | varchar(20) |  | 票据管理_登记_票据包 (blinvcregpkg) |
| 5 | num_begin | 票据开始号 | num_begin | varchar(30) |  | 字符串 (String) |
| 6 | num_end | 票据结束号 | num_end | varchar(30) |  | 字符串 (String) |
| 7 | invcn | 操作张数 | invcn | int |  | 整数 (Integer) |
| 8 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 9 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织结构_财务组织结构版本信息 (finorgstru_v) |
| 10 | pk_invcate | 票据分类 | pk_invcate | varchar(20) |  | 票据分类 (InvCateVO) |
| 11 | pk_psn_inv | 操作员 | pk_psn_inv | varchar(20) |  | 人员基本信息 (psndoc) |