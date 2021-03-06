/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the
 * </p>
 * <code>GetBulkPublishDetails</code> <p>
 * operation.
 * </p>
 */
public class GetBulkPublishDetailsResult implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * The date/time at which the last bulk publish was initiated.
     */
    private java.util.Date bulkPublishStartTime;

    /**
     * If <code>BulkPublishStatus</code> is SUCCEEDED, the time the last bulk
     * publish operation completed.
     */
    private java.util.Date bulkPublishCompleteTime;

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     * this identity pool <p><code>IN_PROGRESS</code> - Data is being
     * published to the configured stream <p><code>SUCCEEDED</code> - All
     * data for the identity pool has been published to the configured stream
     * <p><code>FAILED</code> - Some portion of the data has failed to
     * publish, check <code>FailureMessage</code> for the cause.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED
     */
    private String bulkPublishStatus;

    /**
     * If BulkPublishStatus is FAILED this field will contain the error
     * message that caused the bulk publish to fail.
     */
    private String failureMessage;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBulkPublishDetailsResult withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * The date/time at which the last bulk publish was initiated.
     *
     * @return The date/time at which the last bulk publish was initiated.
     */
    public java.util.Date getBulkPublishStartTime() {
        return bulkPublishStartTime;
    }
    
    /**
     * The date/time at which the last bulk publish was initiated.
     *
     * @param bulkPublishStartTime The date/time at which the last bulk publish was initiated.
     */
    public void setBulkPublishStartTime(java.util.Date bulkPublishStartTime) {
        this.bulkPublishStartTime = bulkPublishStartTime;
    }
    
    /**
     * The date/time at which the last bulk publish was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bulkPublishStartTime The date/time at which the last bulk publish was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBulkPublishDetailsResult withBulkPublishStartTime(java.util.Date bulkPublishStartTime) {
        this.bulkPublishStartTime = bulkPublishStartTime;
        return this;
    }

    /**
     * If <code>BulkPublishStatus</code> is SUCCEEDED, the time the last bulk
     * publish operation completed.
     *
     * @return If <code>BulkPublishStatus</code> is SUCCEEDED, the time the last bulk
     *         publish operation completed.
     */
    public java.util.Date getBulkPublishCompleteTime() {
        return bulkPublishCompleteTime;
    }
    
    /**
     * If <code>BulkPublishStatus</code> is SUCCEEDED, the time the last bulk
     * publish operation completed.
     *
     * @param bulkPublishCompleteTime If <code>BulkPublishStatus</code> is SUCCEEDED, the time the last bulk
     *         publish operation completed.
     */
    public void setBulkPublishCompleteTime(java.util.Date bulkPublishCompleteTime) {
        this.bulkPublishCompleteTime = bulkPublishCompleteTime;
    }
    
    /**
     * If <code>BulkPublishStatus</code> is SUCCEEDED, the time the last bulk
     * publish operation completed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bulkPublishCompleteTime If <code>BulkPublishStatus</code> is SUCCEEDED, the time the last bulk
     *         publish operation completed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBulkPublishDetailsResult withBulkPublishCompleteTime(java.util.Date bulkPublishCompleteTime) {
        this.bulkPublishCompleteTime = bulkPublishCompleteTime;
        return this;
    }

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     * this identity pool <p><code>IN_PROGRESS</code> - Data is being
     * published to the configured stream <p><code>SUCCEEDED</code> - All
     * data for the identity pool has been published to the configured stream
     * <p><code>FAILED</code> - Some portion of the data has failed to
     * publish, check <code>FailureMessage</code> for the cause.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED
     *
     * @return Status of the last bulk publish operation, valid values are:
     *         <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     *         this identity pool <p><code>IN_PROGRESS</code> - Data is being
     *         published to the configured stream <p><code>SUCCEEDED</code> - All
     *         data for the identity pool has been published to the configured stream
     *         <p><code>FAILED</code> - Some portion of the data has failed to
     *         publish, check <code>FailureMessage</code> for the cause.
     *
     * @see BulkPublishStatus
     */
    public String getBulkPublishStatus() {
        return bulkPublishStatus;
    }
    
    /**
     * Status of the last bulk publish operation, valid values are:
     * <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     * this identity pool <p><code>IN_PROGRESS</code> - Data is being
     * published to the configured stream <p><code>SUCCEEDED</code> - All
     * data for the identity pool has been published to the configured stream
     * <p><code>FAILED</code> - Some portion of the data has failed to
     * publish, check <code>FailureMessage</code> for the cause.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED
     *
     * @param bulkPublishStatus Status of the last bulk publish operation, valid values are:
     *         <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     *         this identity pool <p><code>IN_PROGRESS</code> - Data is being
     *         published to the configured stream <p><code>SUCCEEDED</code> - All
     *         data for the identity pool has been published to the configured stream
     *         <p><code>FAILED</code> - Some portion of the data has failed to
     *         publish, check <code>FailureMessage</code> for the cause.
     *
     * @see BulkPublishStatus
     */
    public void setBulkPublishStatus(String bulkPublishStatus) {
        this.bulkPublishStatus = bulkPublishStatus;
    }
    
    /**
     * Status of the last bulk publish operation, valid values are:
     * <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     * this identity pool <p><code>IN_PROGRESS</code> - Data is being
     * published to the configured stream <p><code>SUCCEEDED</code> - All
     * data for the identity pool has been published to the configured stream
     * <p><code>FAILED</code> - Some portion of the data has failed to
     * publish, check <code>FailureMessage</code> for the cause.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED
     *
     * @param bulkPublishStatus Status of the last bulk publish operation, valid values are:
     *         <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     *         this identity pool <p><code>IN_PROGRESS</code> - Data is being
     *         published to the configured stream <p><code>SUCCEEDED</code> - All
     *         data for the identity pool has been published to the configured stream
     *         <p><code>FAILED</code> - Some portion of the data has failed to
     *         publish, check <code>FailureMessage</code> for the cause.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BulkPublishStatus
     */
    public GetBulkPublishDetailsResult withBulkPublishStatus(String bulkPublishStatus) {
        this.bulkPublishStatus = bulkPublishStatus;
        return this;
    }

    /**
     * Status of the last bulk publish operation, valid values are:
     * <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     * this identity pool <p><code>IN_PROGRESS</code> - Data is being
     * published to the configured stream <p><code>SUCCEEDED</code> - All
     * data for the identity pool has been published to the configured stream
     * <p><code>FAILED</code> - Some portion of the data has failed to
     * publish, check <code>FailureMessage</code> for the cause.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED
     *
     * @param bulkPublishStatus Status of the last bulk publish operation, valid values are:
     *         <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     *         this identity pool <p><code>IN_PROGRESS</code> - Data is being
     *         published to the configured stream <p><code>SUCCEEDED</code> - All
     *         data for the identity pool has been published to the configured stream
     *         <p><code>FAILED</code> - Some portion of the data has failed to
     *         publish, check <code>FailureMessage</code> for the cause.
     *
     * @see BulkPublishStatus
     */
    public void setBulkPublishStatus(BulkPublishStatus bulkPublishStatus) {
        this.bulkPublishStatus = bulkPublishStatus.toString();
    }
    
    /**
     * Status of the last bulk publish operation, valid values are:
     * <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     * this identity pool <p><code>IN_PROGRESS</code> - Data is being
     * published to the configured stream <p><code>SUCCEEDED</code> - All
     * data for the identity pool has been published to the configured stream
     * <p><code>FAILED</code> - Some portion of the data has failed to
     * publish, check <code>FailureMessage</code> for the cause.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, SUCCEEDED
     *
     * @param bulkPublishStatus Status of the last bulk publish operation, valid values are:
     *         <p><code>NOT_STARTED</code> - No bulk publish has been requested for
     *         this identity pool <p><code>IN_PROGRESS</code> - Data is being
     *         published to the configured stream <p><code>SUCCEEDED</code> - All
     *         data for the identity pool has been published to the configured stream
     *         <p><code>FAILED</code> - Some portion of the data has failed to
     *         publish, check <code>FailureMessage</code> for the cause.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BulkPublishStatus
     */
    public GetBulkPublishDetailsResult withBulkPublishStatus(BulkPublishStatus bulkPublishStatus) {
        this.bulkPublishStatus = bulkPublishStatus.toString();
        return this;
    }

    /**
     * If BulkPublishStatus is FAILED this field will contain the error
     * message that caused the bulk publish to fail.
     *
     * @return If BulkPublishStatus is FAILED this field will contain the error
     *         message that caused the bulk publish to fail.
     */
    public String getFailureMessage() {
        return failureMessage;
    }
    
    /**
     * If BulkPublishStatus is FAILED this field will contain the error
     * message that caused the bulk publish to fail.
     *
     * @param failureMessage If BulkPublishStatus is FAILED this field will contain the error
     *         message that caused the bulk publish to fail.
     */
    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
    
    /**
     * If BulkPublishStatus is FAILED this field will contain the error
     * message that caused the bulk publish to fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failureMessage If BulkPublishStatus is FAILED this field will contain the error
     *         message that caused the bulk publish to fail.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetBulkPublishDetailsResult withFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getBulkPublishStartTime() != null) sb.append("BulkPublishStartTime: " + getBulkPublishStartTime() + ",");
        if (getBulkPublishCompleteTime() != null) sb.append("BulkPublishCompleteTime: " + getBulkPublishCompleteTime() + ",");
        if (getBulkPublishStatus() != null) sb.append("BulkPublishStatus: " + getBulkPublishStatus() + ",");
        if (getFailureMessage() != null) sb.append("FailureMessage: " + getFailureMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getBulkPublishStartTime() == null) ? 0 : getBulkPublishStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getBulkPublishCompleteTime() == null) ? 0 : getBulkPublishCompleteTime().hashCode()); 
        hashCode = prime * hashCode + ((getBulkPublishStatus() == null) ? 0 : getBulkPublishStatus().hashCode()); 
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetBulkPublishDetailsResult == false) return false;
        GetBulkPublishDetailsResult other = (GetBulkPublishDetailsResult)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getBulkPublishStartTime() == null ^ this.getBulkPublishStartTime() == null) return false;
        if (other.getBulkPublishStartTime() != null && other.getBulkPublishStartTime().equals(this.getBulkPublishStartTime()) == false) return false; 
        if (other.getBulkPublishCompleteTime() == null ^ this.getBulkPublishCompleteTime() == null) return false;
        if (other.getBulkPublishCompleteTime() != null && other.getBulkPublishCompleteTime().equals(this.getBulkPublishCompleteTime()) == false) return false; 
        if (other.getBulkPublishStatus() == null ^ this.getBulkPublishStatus() == null) return false;
        if (other.getBulkPublishStatus() != null && other.getBulkPublishStatus().equals(this.getBulkPublishStatus()) == false) return false; 
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null) return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public GetBulkPublishDetailsResult clone() {
        try {
            return (GetBulkPublishDetailsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    